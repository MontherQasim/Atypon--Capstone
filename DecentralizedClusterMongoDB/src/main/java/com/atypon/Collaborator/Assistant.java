package com.atypon.Collaborator;

import com.atypon.ProtocolBuffer.SearchClusterProtos;
import com.atypon.Model.Document;
import com.atypon.Model.Record;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.atypon.Message.Info.logCalculateResultsMessage;
import static com.atypon.Algorithm.TermFrequencyInverseDocumentFrequency.evaluateDocumentScores;

public class Assistant {
    public static List<SearchClusterProtos.Response.DocumentStats> calculateResults(List<Record> records, List<String> terms) {
        Map<String, Document> allDocuments = documentResults(records);
        logCalculateResultsMessage();
        Map<Double, List<String>> scoreToDocuments = evaluateDocumentScores(terms, allDocuments);
        return sortDocumentsByScore(scoreToDocuments);
    }
    private static Map<String, Document> documentResults(List<Record> records) {
        return records.stream()
                .map(Record::getDocumentData)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    private static List<SearchClusterProtos.Response.DocumentStats> sortDocumentsByScore(Map<Double, List<String>> scoreToDocuments) {
        List<SearchClusterProtos.Response.DocumentStats> sortedDocumentsStatsList = new ArrayList<>();
        for (Map.Entry<Double, List<String>> docScorePair : scoreToDocuments.entrySet()) {
            double score = docScorePair.getKey();
            for (String document : docScorePair.getValue()) {
                File documentPath = new File(document);
                SearchClusterProtos.Response.DocumentStats documentStats = SearchClusterProtos.Response.DocumentStats.newBuilder()
                        .setScore(score)
                        .setName(documentPath.getName())
                        .build();
                sortedDocumentsStatsList.add(documentStats);
            }
        }
        return sortedDocumentsStatsList;
    }
}