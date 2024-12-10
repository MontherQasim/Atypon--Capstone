
package com.atypon.Cluster;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LeaderElection implements Watcher {
    private static final String ELECTION_NAMESPACE = "/election";
    private String currentNodeName;
    private final ZooKeeper zooKeeper;
    private final OnElectionCallback electionCallback;


    public LeaderElection(ZooKeeper zooKeeper, OnElectionCallback onElectionCallback) {
        this.zooKeeper = zooKeeper;
        this.electionCallback = onElectionCallback;
    }
    public void createElectionNodeIfNotExists() throws KeeperException, InterruptedException {
        Stat electionNodeStat = zooKeeper.exists(ELECTION_NAMESPACE, false);
        if (electionNodeStat == null) {
            zooKeeper.create(ELECTION_NAMESPACE, new byte[]{}, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
    }

    public void volunteerForLeadership() throws KeeperException, InterruptedException {
        String nodePrefix = ELECTION_NAMESPACE + "/node_";
        String nodeFullPath = zooKeeper.create(nodePrefix,
                new byte[]{},
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.EPHEMERAL_SEQUENTIAL);

        System.out.println("node name " + nodeFullPath);
        this.currentNodeName = nodeFullPath.replace(ELECTION_NAMESPACE + "/", "");
    }

    public void reelectLeader() throws KeeperException, InterruptedException {
        Stat predecessorStat = null;
        String predecessorZnodeName = "";
        while (predecessorStat == null) {
            List<String> children = zooKeeper.getChildren(ELECTION_NAMESPACE, false);

            Collections.sort(children);
            String smallestChild = children.getFirst();

            if (smallestChild.equals(currentNodeName)) {
                System.out.println("I am the Primary");
                electionCallback.onElectedToBeLeader();
                return;
            } else {
                System.out.println("I am the Secondary");
                int predecessorIndex = Collections.binarySearch(children, currentNodeName) - 1;
                predecessorZnodeName = children.get(predecessorIndex);
                predecessorStat = zooKeeper.exists(ELECTION_NAMESPACE + "/" + predecessorZnodeName, this);
            }
        }
        electionCallback.onWorker();
        System.out.println("Watching Node " + predecessorZnodeName);
        System.out.println();
    }

    @Override
    public void process(WatchedEvent event) {
        if (Objects.requireNonNull(event.getType()) == Event.EventType.NodeDeleted) {
            try {
                reelectLeader();
            } catch (InterruptedException | KeeperException ignored) {
            }
        }
    }
}