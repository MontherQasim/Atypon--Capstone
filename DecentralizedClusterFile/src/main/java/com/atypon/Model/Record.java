package com.atypon.Model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Record implements Serializable, Cloneable {
    private final Map<String, Document> record = new HashMap<>();

    public void addDocumentData(String document, Document documentData) {
        record.put(document, documentData);
    }

    public Map<String, Document> getDocumentData() {
        return Collections.unmodifiableMap(record);
    }

    @Override
    public String toString() {
        return "Record{" +
                "record=" + record +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record1 = (Record) o;
        return Objects.equals(record, record1.record);
    }

    @Override
    public int hashCode() {
        return Objects.hash(record);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        Record clonedRecord = new Record();
        for (Map.Entry<String, Document> entry : this.record.entrySet()) {
            clonedRecord.addDocumentData(entry.getKey(), (Document) entry.getValue().clone());
        }
        return clonedRecord;
    }
}