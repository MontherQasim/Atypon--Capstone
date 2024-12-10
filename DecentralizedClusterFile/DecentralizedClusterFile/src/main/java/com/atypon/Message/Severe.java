package com.atypon.Message;

import org.apache.zookeeper.KeeperException;

import java.io.IOException;

import java.util.logging.Logger;

import static com.atypon.Message.Colours.colorizeRed;
public class Severe {
    private static final Logger severeLogger = Logger.getLogger("SevereLogger");

    public static void logRequestError(Exception e) {
        severeLogger.severe(colorizeRed("Error processing request: " + e.getMessage()));
    }

    public static void logDocumentReadingError(Exception e) {
        severeLogger.severe(colorizeRed("Document reading error: Unable to process document: " + e.getMessage()));
    }

    public static void logSerializationError(Exception e) {
        severeLogger.severe(colorizeRed("Failed to serialize object: " + e.getMessage()));
    }

    public static void logDeserializationError(Exception e) {
        severeLogger.severe(colorizeRed("Failed to deserialize object: " + e.getMessage()));
    }

    public static void logServerError(IOException e) {
        severeLogger.severe(colorizeRed("Error starting HTTP server: " + e.getMessage()));
    }

    public static void logErrorListeningForUpdates(InterruptedException e) {
        severeLogger.severe(colorizeRed("Error listening for updates: " + e.getMessage()));
    }

    public static void logErrorLeavingForCluster(InterruptedException e) {
        severeLogger.severe(colorizeRed("Error leaving the cluster: " + e.getMessage()));
    }

    public static void logErrorCreatingNode(KeeperException e) {
        severeLogger.severe(colorizeRed("Error creating registry node: " + e.getMessage()));
    }

    public static void logErrorCreatingNode(InterruptedException e) {
        severeLogger.severe(colorizeRed("Error processing ZooKeeper event: " + e.getMessage()));
    }

    public static void logApplicationError(InterruptedException e) {
        severeLogger.severe(colorizeRed("Launcher encountered an error: " + e.getMessage()));
    }

    public static void logInvalidPortNumberError(NumberFormatException e) {
        severeLogger.info(colorizeRed("Invalid port number: " + e.getMessage()));
    }

    public static void logLeaderSetupError(KeeperException e) {
        severeLogger.info(colorizeRed("An error occurred while setting up as leader: " + e.getMessage()));
    }

    public static void logWorkerSetupError(KeeperException e) {
        severeLogger.info(colorizeRed("An error occurred while setting up as worker: " + e.getMessage()));
    }
}