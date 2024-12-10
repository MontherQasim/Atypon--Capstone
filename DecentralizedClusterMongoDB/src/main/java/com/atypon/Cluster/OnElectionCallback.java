package com.atypon.Cluster;

public interface OnElectionCallback {

    void onElectedToBeLeader();

    void onWorker();

}