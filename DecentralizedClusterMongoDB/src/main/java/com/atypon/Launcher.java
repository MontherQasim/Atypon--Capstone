package com.atypon;

import com.atypon.Cluster.LeaderElection;
import com.atypon.Cluster.OnElectionCallback;
import com.atypon.Cluster.ServiceRegistry;
import com.atypon.Collaborator.Coordinator;
import com.atypon.Collaborator.DocumentRecordBuilder;
import com.atypon.Network.Client;
import com.atypon.Network.Server;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Objects;

import static com.atypon.Cluster.ServiceRegistry.COORDINATORS;
import static com.atypon.Cluster.ServiceRegistry.WORKERS;
import static com.atypon.Message.Info.*;
import static com.atypon.Message.Severe.*;

public class Launcher implements Watcher, OnElectionCallback {

    private static final int SESSION_TIMEOUT = 3000;
    private final Object zooKeeperLock = new Object();
    private final LeaderElection leaderElection;
    private final ZooKeeper zooKeeper;
    private final ServiceRegistry workersServiceRegistry;
    private final ServiceRegistry coordinatorsServiceRegistry;
    private final int currentServerPort;
    private final String zookeeperAddress;
    private static String mongoConnection = "";
    private Server webServer;


    public Launcher(int currentServerPort, String zookeeperAddress,String mongoConnection) throws IOException, KeeperException, InterruptedException {
        this.currentServerPort = currentServerPort;
        this.zookeeperAddress = zookeeperAddress;
        this.zooKeeper = connectToZookeeper();
        this.workersServiceRegistry = new ServiceRegistry(zooKeeper, WORKERS);
        this.coordinatorsServiceRegistry = new ServiceRegistry(zooKeeper, COORDINATORS);
        this.leaderElection = new LeaderElection(zooKeeper, this);
        this.leaderElection.createElectionNodeIfNotExists();
        Launcher.mongoConnection =mongoConnection;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            logInvalidArgsError();
            System.exit(1);
        }

        try {
            int currentServerPort = Integer.parseInt(args[0]);
            String zookeeperAddress = args[1] + ":2181";
            String mongoConnection = args[2] ;
            Launcher launcher = new Launcher(currentServerPort, zookeeperAddress, mongoConnection);
            launcher.start();
        } catch (NumberFormatException e) {
            logInvalidPortNumberError(e);
            System.exit(1);
        } catch (IOException | KeeperException | InterruptedException e) {
            assert e instanceof InterruptedException;
            logApplicationError((InterruptedException) e);
            System.exit(1);
        }
    }
    public static String getMongoConnection() {
        return mongoConnection;
    }

    public ZooKeeper connectToZookeeper() throws IOException {
        return new ZooKeeper(zookeeperAddress, SESSION_TIMEOUT, this);
    }

    public void start() throws InterruptedException, KeeperException {
        leaderElection.volunteerForLeadership();
        leaderElection.reelectLeader();
        run();
        close();
        logZookeeperDisconnectExit();
    }

    public void run() throws InterruptedException {
        synchronized (zooKeeperLock) {
            zooKeeperLock.wait();
        }
    }

    public void close() throws InterruptedException {
        zooKeeper.close();
    }

    @Override
    public void process(WatchedEvent event) {
        if (Objects.requireNonNull(event.getType()) == Event.EventType.None) {
            if (event.getState() == Event.KeeperState.SyncConnected) {
                logZookeeperConnectionSuccess();
            } else {
                synchronized (zooKeeperLock) {
                    logZookeeperDisconnect();
                    zooKeeperLock.notifyAll();
                }
            }
        }
    }

    @Override
    public void onElectedToBeLeader() {
        workersServiceRegistry.leaveCluster();
        workersServiceRegistry.listenForUpdates();

        if (webServer != null) {
            webServer.stop();
        }

        Coordinator coordinator = new Coordinator(workersServiceRegistry, new Client());
        webServer = new Server(currentServerPort, coordinator);
        webServer.startServer();

        try {
            String currentServerAddress =
                    String.format("http://%s:%d%s", InetAddress.getLocalHost().getCanonicalHostName(), currentServerPort, coordinator.getEndpoint());
            coordinatorsServiceRegistry.joinCluster(currentServerAddress);
        } catch (InterruptedException | UnknownHostException | KeeperException e) {
            assert e instanceof KeeperException;
            logLeaderSetupError((KeeperException) e);
        }
    }

    @Override
    public void onWorker() {
        DocumentRecordBuilder documentRecordBuilder = new DocumentRecordBuilder();
        if (webServer == null) {
            webServer = new Server(currentServerPort, documentRecordBuilder);
            webServer.startServer();
        }

        try {
            String currentServerAddress =
                    String.format("http://%s:%d%s", InetAddress.getLocalHost().getCanonicalHostName(), currentServerPort, documentRecordBuilder.getEndpoint());

            workersServiceRegistry.joinCluster(currentServerAddress);
        } catch (InterruptedException | UnknownHostException | KeeperException e) {
            assert e instanceof KeeperException;
            logWorkerSetupError((KeeperException) e);
        }
    }
}