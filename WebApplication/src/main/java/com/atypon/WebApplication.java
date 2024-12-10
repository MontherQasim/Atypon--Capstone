package com.atypon;

import com.atypon.Network.Server;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import com.atypon.Search.UserSearch;
import com.atypon.ServiceRegistry.ServiceRegistry;

import java.io.IOException;
import java.util.logging.Logger;

public class WebApplication implements Watcher {
    private static final Logger logger = Logger.getLogger(WebApplication.class.getName());
    private final Object zooKeeperLock = new Object();
    private ZooKeeper zooKeeper;
    private final int currentServerPort;
    private final String zookeeperAddress;
    private static final int SESSION_TIMEOUT = 3000;

    public WebApplication(int currentServerPort, String zookeeperAddress) {
        this.currentServerPort = currentServerPort;
        this.zookeeperAddress = zookeeperAddress;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            logger.severe("Usage: WebApplication <serverPort> <zookeeperAddress>");
            System.exit(1);
        }

        try {
            int currentServerPort = Integer.parseInt(args[0]);
            String zookeeperAddress = args[1] + ":2181";

            WebApplication webApplication = new WebApplication(currentServerPort, zookeeperAddress);
            webApplication.start();
        } catch (NumberFormatException e) {
            logger.severe("Invalid port number" + e);
            System.exit(1);
        }
    }

    public void start() {
        try {
            ZooKeeper zooKeeper = connectToZookeeper();

            ServiceRegistry coordinatorsServiceRegistry = new ServiceRegistry(zooKeeper, ServiceRegistry.COORDINATORS_REGISTRY_NODE);

            UserSearch searchHandler = new UserSearch(coordinatorsServiceRegistry);
            Server server = new Server(currentServerPort, searchHandler);
            server.startServer();

            logger.info("Server is listening on port " + currentServerPort);

            run();
            close();
            logger.info("Disconnected from Zookeeper, exiting webApplication");
        } catch (IOException | InterruptedException e) {
            logger.severe("Error running the application" + e);
            System.exit(1);
        }
    }

    public ZooKeeper connectToZookeeper() throws IOException {
        this.zooKeeper = new ZooKeeper(zookeeperAddress, SESSION_TIMEOUT, this);
        return zooKeeper;
    }

    public void run() throws InterruptedException {
        synchronized (zooKeeperLock) {
            zooKeeperLock.wait();
        }
    }

    public void close() {
        try {
            if (zooKeeper != null) {
                zooKeeper.close();
            }
        } catch (InterruptedException e) {
            logger.severe("Error closing Zookeeper connection" + e);
        }
    }

    @Override
    public void process(WatchedEvent event) {
        if (event.getType() == Event.EventType.None) {
            if (event.getState() == Event.KeeperState.SyncConnected) {
                logger.info("Successfully connected to Zookeeper");
            } else {
                synchronized (zooKeeperLock) { // Synchronize on zooKeeperLock
                    logger.warning("Disconnected from Zookeeper event");
                    zooKeeperLock.notifyAll();
                }
            }
        }
    }
}
