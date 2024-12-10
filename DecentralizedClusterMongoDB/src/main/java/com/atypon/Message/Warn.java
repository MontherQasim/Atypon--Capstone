package com.atypon.Message;

import java.util.logging.Logger;

import static com.atypon.Message.Colours.colorizeYellow;

public class Warn {

    private static final Logger warnLogger = Logger.getLogger("WarnLogger");

    public static void logNoAvailableWorkersMessage() {
        warnLogger.info(colorizeYellow("No available workers found in the cluster"));
    }
    public static void logClusterJoin() {
        warnLogger.info(colorizeYellow("Already joined the cluster"));
    }
}