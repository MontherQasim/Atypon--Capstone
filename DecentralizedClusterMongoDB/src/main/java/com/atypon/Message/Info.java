package com.atypon.Message;

import java.util.logging.Logger;

import static com.atypon.Message.Colours.colorizeBlue;
public class Info {
    private static final Logger infoLogger = Logger.getLogger("InfoLogger");

    public static void logCalculateResultsMessage() {
        infoLogger.info(colorizeBlue("Score calculation in progress for all documents..."));
    }
    public static void logDocumentProcessing(int size) {
        infoLogger.info(colorizeBlue("Received " + size + " documents to process"));
    }
    public static void logServerStart(int port) {
        infoLogger.info(colorizeBlue("Server started on port " + port));
    }
    public static void logServerStop() {
        infoLogger.info(colorizeBlue("Server stopped"));
    }
    public static void logClusterJoined() {
        infoLogger.info(colorizeBlue("Joined the cluster"));
    }
    public static void logZookeeperDisconnect() {
        infoLogger.info(colorizeBlue("Lost connection to Zookeeper"));
    }
    public static void logZookeeperConnectionSuccess() {
        infoLogger.info(colorizeBlue("Connection to Zookeeper established successfully"));
    }
    public static void logZookeeperDisconnectExit() {
        infoLogger.info(colorizeBlue("Disconnected from Zookeeper, exiting application"));
    }


}