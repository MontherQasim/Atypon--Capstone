package com.atypon.Database;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static com.atypon.Launcher.getMongoConnection;


public class MongoDB {
    static String connectionMongoDB = "mongodb://" + getMongoConnection();
    static MongoClient mongoClient = MongoClients.create(connectionMongoDB);
    static MongoDatabase database = mongoClient.getDatabase("ComputerScience");
    static MongoCollection<Document> collection = database.getCollection("book");

    public static List<String> extractWordsFromText(String documentName) {
        List<String> wordsList = new ArrayList<>();

        Document query = new Document("name", documentName);
        Document result = collection.find(query).first();

        if (result != null) {
            String content = result.getString("content");
            String[] wordsArray = content.split("\\W+");

            wordsList = new ArrayList<>(Arrays.asList(wordsArray));
            wordsList.removeIf(String::isEmpty);
            wordsList = new ArrayList<>(Set.copyOf(wordsList));
        }

        return wordsList;
    }

    public static List<String> fetchDocumentName() {
        List<String> documentNames = new ArrayList<>();

        FindIterable<Document> documents = collection.find();

        for (Document document : documents) {
            String name = document.getString("name");
            if (name != null) {
                documentNames.add(name);
            }
        }
        return documentNames;
    }
}