package com.atypon.Message;

import java.io.File;
import java.util.List;

import static com.atypon.Message.Colours.colorizeRusset;
public class Exceptions {
    public static void validateDirectory(File directory) {
        if (directory == null || !directory.exists() || !directory.isDirectory() ) {
            throw new IllegalArgumentException(colorizeRusset("Invalid or non-existent directory"));
        }
    }
    public static void validateInputs(List<String> words, String term) {
        if (isNullOrEmpty(words) || isNullOrEmpty(term)) {
            throw new IllegalArgumentException(colorizeRusset("Both the list of words and the search term must contain valid values and must not be empty."));
        }
    }
    private static boolean isNullOrEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    private static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}