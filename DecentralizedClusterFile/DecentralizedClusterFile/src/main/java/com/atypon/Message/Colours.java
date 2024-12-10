package com.atypon.Message;
public class Colours {
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RUSSET = "\u001B[38;2;128;70;27m";
    static String colorizeBlue(String message) {

        return colorize(message, ANSI_BLUE);
    }
    static String colorizeYellow(String message) {
        return colorize(message, ANSI_YELLOW);
    }
    static String colorizeGreen(String message) {
        return colorize(message, ANSI_GREEN);
    }
    static String colorizeRed(String message) {
        return colorize(message, ANSI_RED);
    }
    static String colorizeRusset(String message) {
        return colorize(message, ANSI_RUSSET);
    }
    private static String colorize(String message, String color) {
        return color + message + ANSI_RESET;
    }
}