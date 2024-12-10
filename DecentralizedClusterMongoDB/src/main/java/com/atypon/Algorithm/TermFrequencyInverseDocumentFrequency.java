package com.atypon.Algorithm;

import com.atypon.Model.Document;

import java.util.*;
import java.util.stream.Collectors;

import static com.atypon.Algorithm.InverseDocumentFrequency.calculateTermToInverseDocumentFrequency;
public class TermFrequencyInverseDocumentFrequency {

    public static Map<Double, List<String>> evaluateDocumentScores(List<String> terms, Map<String, Document> record) {
        Map<String, Double> termToInverseDocumentFrequency = calculateTermToInverseDocumentFrequency(terms, record);
        return record.entrySet().parallelStream()
                .collect(Collectors.groupingBy(
                        entry -> calculateDocumentScoreWithInverseTermFrequency(terms, entry.getValue(), termToInverseDocumentFrequency),
                        () -> new TreeMap<>(Comparator.comparingDouble(e -> (double) e).reversed()),
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));
    }
    private static double calculateDocumentScoreWithInverseTermFrequency(List<String> terms, Document document, Map<String, Double> termToInverseDocumentFrequency) {
        return terms.parallelStream()
                .mapToDouble(term -> {
                    double termFrequency = document.getFrequency(term);
                    double inverseTermFrequency = termToInverseDocumentFrequency.getOrDefault(term, 0.0);
                    return termFrequency * inverseTermFrequency;
                })
                .sum();
    }
}