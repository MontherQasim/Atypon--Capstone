package com.atypon.Collaborator;

import com.atypon.Model.Action;
import com.atypon.Model.Document;
import com.atypon.Model.Record;
import com.atypon.Network.OnRequestCallback;
import com.atypon.Network.ObjectStreamHandler;

import java.util.List;

import static com.atypon.Algorithm.TermFrequency.calculateTermFrequencies;
//import static com.atypon.Document.DocumentHandler.extractWordsFromText;
import static com.atypon.Database.MongoDB.extractWordsFromText;
import static com.atypon.Message.Info.logDocumentProcessing;

public class DocumentRecordBuilder implements OnRequestCallback {
    private static final String ENDPOINT = "/action";

    @Override
    public byte[] processRequestData(byte[] requestPayload) {
        Action action = deserializeAction(requestPayload);
        return serializeResult(createResult(action));
    }

    @Override
    public String getEndpoint() {
        return ENDPOINT;
    }

    private Action deserializeAction(byte[] requestPayload) {
        return (Action) ObjectStreamHandler.deserializeObject(requestPayload);
    }

    private byte[] serializeResult(Record result) {
        return ObjectStreamHandler.serializeObject(result);
    }

    private Record createResult(Action action) {
        List<String> documents = action.documents();
        List<String> terms = action.searchTerms();
        logDocumentProcessing(documents.size());
        Record record = new Record();
        processDocuments(documents, terms, record);
        return record;
    }

    private void processDocuments(List<String> documents, List<String>  terms, Record record) {
        documents.forEach(document -> {
            List<String> words = extractWordsFromText(document);
            Document data = calculateTermFrequencies(words, terms);
            record.addDocumentData(document, data);
        });
    }
}