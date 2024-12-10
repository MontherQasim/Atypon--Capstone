package com.atypon.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Document implements Serializable, Cloneable {
    private final Map<String, Double> termToFrequency = new HashMap<>();

    public void setFrequency(String term, double frequency) {
        termToFrequency.put(term, frequency);
    }

    public double getFrequency(String term) {
        return termToFrequency.getOrDefault(term, 0.0);
    }

    @Override
    public String toString() {
        return "Document{" +
                "termToFrequency=" + termToFrequency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(termToFrequency, document.termToFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(termToFrequency);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        Document clonedDocument = new Document();
        clonedDocument.termToFrequency.putAll(this.termToFrequency);
        return clonedDocument;
    }
}