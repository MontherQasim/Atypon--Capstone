package com.atypon.Algorithm;

import com.atypon.Model.Document;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class InverseDocumentFrequency {
    public static Map<String, Double> calculateTermToInverseDocumentFrequency(List<String> terms, Map<String, Document> record) {
    return terms.stream()
            .collect(Collectors.toMap(
                    term -> term,
                    term -> calculateInverseDocumentFrequency(term, record)
            ));
    }
    private static double calculateInverseDocumentFrequency(String term, Map<String, Document> documentResults) {
        long numberOfDocumentsContainingTerm = countDocumentsWithTerm(term, documentResults);
        return numberOfDocumentsContainingTerm == 0 ? 0 : Math.log10(documentResults.size() / (double) numberOfDocumentsContainingTerm);
    }
    private static long countDocumentsWithTerm(String term, Map<String, Document> record) {
        return record.values().parallelStream()
                .filter(document -> document.getFrequency(term) > 0.0)
                .count();
    }
}