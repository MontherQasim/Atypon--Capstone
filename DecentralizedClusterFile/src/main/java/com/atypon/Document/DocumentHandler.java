package com.atypon.Document;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.atypon.Message.Exceptions.validateDirectory;
import static com.atypon.Message.Severe.logDocumentReadingError;
public class DocumentHandler {

    private static final String DOCUMENTS_DIRECTORY = "C:\\Users\\month\\Desktop\\Atypon\\Atypon\\Capstone\\FinalProject\\DecentralizedClusterFile\\src\\main\\resources";
    public static List<String> extractWordsFromText(String document) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(document))) {
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            return getWordsFromDocument(lines);
        } catch (IOException e) {
            logDocumentReadingError(e);
            return Collections.emptyList();
        }
    }
    public static List<String> fetchDocumentPaths() {
        File directory = new File(DOCUMENTS_DIRECTORY);
        validateDirectory(directory);
        return Arrays.stream(Objects.requireNonNull(directory.list()))
                .map(DocumentHandler::concatenateDocumentPath)
                .collect(Collectors.toList());
    }
    private static List<String> getWordsFromDocument(List<String> lines) {
        return lines.stream()
                .flatMap(line -> fetchWordsFromLine(line).stream())
                .collect(Collectors.toList());
    }
    public static List<String> fetchWordsFromLine(String line) {
        return Arrays.asList(line.split("[.\\s,\\-?!;:/]+"));
    }
    private static String concatenateDocumentPath(String documentName) {
        return String.join("/", DOCUMENTS_DIRECTORY, documentName);
    }
}