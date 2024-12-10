package com.atypon.ServiceRegistry;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class ServiceRegistry implements Watcher {
    public static final String COORDINATORS_REGISTRY_NODE = "/coordinators_service_registry";
    private final ZooKeeper zooKeeper;
    private List<String> serviceEndpoints = null;
    private final String registryNode;
    private final Random random;
    private static final Logger severeLogger = Logger.getLogger("SevereLogger");

    public ServiceRegistry(ZooKeeper zooKeeper, String registryNode) {
        this.zooKeeper = zooKeeper;
        this.registryNode = registryNode;
        this.random = new Random();
        createRegistryNode();
    }

    private void createRegistryNode() {
        try {
            if (zooKeeper.exists(registryNode, false) == null) {
                zooKeeper.create(registryNode, new byte[]{}, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
        } catch (InterruptedException | KeeperException e) {
            assert e instanceof KeeperException;
            severeLogger.severe("Error creating registry node: " + e.getMessage());
        }
    }

    public synchronized String getRandomServiceAddress() throws KeeperException, InterruptedException {
        if (serviceEndpoints == null) {
            refreshEndpoints();
        }
        if (!serviceEndpoints.isEmpty()) {
            int randomIndex = random.nextInt(serviceEndpoints.size());
            return serviceEndpoints.get(randomIndex);
        } else {
            return null;
        }
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
        severeLogger.info("Current cluster endpoints: {" + endpoints + "}");
    }

    @Override
    public void process(WatchedEvent event) {
        try {
            refreshEndpoints();
        } catch (KeeperException | InterruptedException e) {
            assert e instanceof KeeperException;
            severeLogger.severe("Error processing ZooKeeper event: " + e.getMessage());
        }
    }
}