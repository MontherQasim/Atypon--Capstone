package com.atypon.Document;

import com.atypon.ProtocolBuffer.SearchClusterProtos;
import com.atypon.Model.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.atypon.Database.MongoDB.fetchDocumentName;
import static com.atypon.Message.Warn.logNoAvailableWorkersMessage;

public class DocumentPartitioner  {
    private static List<String> documents = null;
    public static List<Action> generateActionList(int workerCount, List<String> searchKeys) {
        initializeDocuments();
        List<List<String>> documentsPerWorker = splitDocumentList(workerCount, documents);
        return documentsPerWorker.parallelStream()
                .map(workerDocuments -> new Action(searchKeys, workerDocuments))
                .collect(Collectors.toList());
    }
    public static void checkWorkers(SearchClusterProtos.Response.Builder searchResponse, List<String> workers) {
        if (workers.isEmpty()) {
            logNoAvailableWorkersMessage();
            searchResponse.build();
        }
    }
    private static List<List<String>> splitDocumentList(int numberOfWorkers, List<String> documents) {
        int numberOfDocumentsPerWorker = calculateNumberOfDocumentsPerWorker(numberOfWorkers, documents);
        return IntStream.range(0, numberOfWorkers)
                .mapToObj(workerIndex -> getWorkerDocuments(workerIndex, numberOfDocumentsPerWorker, documents))
                .filter(workerDocuments -> !workerDocuments.isEmpty())
                .collect(Collectors.toList());
    }
    private static int calculateNumberOfDocumentsPerWorker(int numberOfWorkers, List<String> documents) {
        return (int) Math.ceil((double) documents.size() / numberOfWorkers);
    }
    private static List<String> getWorkerDocuments(int workerIndex, int numberOfDocumentsPerWorker, List<String> documents) {
        int firstDocumentIndex = workerIndex * numberOfDocumentsPerWorker;
        int lastDocumentIndexExclusive = Math.min(firstDocumentIndex + numberOfDocumentsPerWorker, documents.size());
        if (firstDocumentIndex >= lastDocumentIndexExclusive) {
            return Collections.emptyList();
        }
        return new ArrayList<>(documents.subList(firstDocumentIndex, lastDocumentIndexExclusive));
    }
    private static void initializeDocuments() {
        documents = fetchDocumentName();
    }
}