package com.atypon.Cluster;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.atypon.Message.Data.CurrentClusterEndpoints;
import static com.atypon.Message.Info.logClusterJoined;
import static com.atypon.Message.Severe.*;
import static com.atypon.Message.Warn.logClusterJoin;


public class ServiceRegistry implements Watcher {
    public static final String WORKERS = "/workers_service_registry";
    public static final String COORDINATORS = "/coordinators_service_registry";

    private final ZooKeeper zooKeeper;
    private List<String> serviceEndpoints = null;
    private String currentNode = null;
    private final String registryNode;

    public ServiceRegistry(ZooKeeper zooKeeper, String registryNode) {
        this.zooKeeper = zooKeeper;
        this.registryNode = registryNode;
        createRegistryNode();
    }

    public void joinCluster(String metadata) throws KeeperException, InterruptedException {
        if (currentNode != null) {
            logClusterJoin();
            return;
        }
        this.currentNode = zooKeeper.create(registryNode + "/node_", metadata.getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        logClusterJoined();
    }

    public void listenForUpdates() {
        try {
            refreshEndpoints();
        } catch (KeeperException | InterruptedException e) {
            assert e instanceof InterruptedException;
            logErrorListeningForUpdates((InterruptedException) e);
        }
    }

    public void leaveCluster() {
        try {
            if (currentNode != null && zooKeeper.exists(currentNode, false) != null) {
                zooKeeper.delete(currentNode, -1);
            }
        } catch (KeeperException | InterruptedException e) {
            assert e instanceof InterruptedException;
            logErrorLeavingForCluster((InterruptedException) e);
        }
    }

    private void createRegistryNode() {
        try {
            if (zooKeeper.exists(registryNode, false) == null) {
                zooKeeper.create(registryNode, new byte[]{}, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
        } catch (InterruptedException | KeeperException e) {
            assert e instanceof KeeperException;
            logErrorCreatingNode((KeeperException) e);
        }
    }

    public synchronized List<String> getAllServiceEndpoints() throws KeeperException, InterruptedException {
        if (serviceEndpoints == null) {
            refreshEndpoints();
        }
        return serviceEndpoints;
    }

    private synchronized void refreshEndpoints() throws KeeperException, InterruptedException {
        List<String> nodes = zooKeeper.getChildren(registryNode, this);

        List<String> endpoints = new ArrayList<>(nodes.size());

        for (String node : nodes) {
            String nodePath = registryNode + "/" + node;
            Stat stat = zooKeeper.exists(nodePath, false);
            if (stat == null) {
                continue;
            }

            byte[] endpointBytes = zooKeeper.getData(nodePath, false, stat);
            String endpoint = new String(endpointBytes);
            endpoints.add(endpoint);
        }

        this.serviceEndpoints = Collections.unmodifiableList(endpoints);
        CurrentClusterEndpoints(endpoints.toString());
    }

    @Override
    public void process(WatchedEvent event) {
        try {
            refreshEndpoints();
        } catch (KeeperException | InterruptedException e) {
            assert e instanceof KeeperException;
            logErrorCreatingNode((KeeperException) e);
        }
    }
}