package com.atypon.Algorithm;

import com.atypon.Model.Document;
import java.util.List;

import static com.atypon.Message.Exceptions.validateInputs;
public class TermFrequency {
    public static Document calculateTermFrequencies(List<String> documentWords, List<String> targetTerms) {
        Document document = new Document();
        targetTerms.forEach(term -> {
            double termFrequency = calculateFrequency(documentWords, term.toLowerCase());
            document.setFrequency(term, termFrequency);
        });
        return document;
    }
    private static double calculateFrequency(List<String> words, String term) {
        validateInputs(words, term);
        long count = countTermOccurrences(words, term);
        return (double) count / words.size();
    }
    private static long countTermOccurrences(List<String> words, String term) {
        return words.stream().filter(word -> word.equalsIgnoreCase(term)).count();
    }
}