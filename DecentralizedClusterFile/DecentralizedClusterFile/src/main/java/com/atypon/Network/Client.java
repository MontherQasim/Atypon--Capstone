package com.atypon.Network;

import com.atypon.Model.Record;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import static com.atypon.Network.ObjectStreamHandler.deserializeObject;

public class Client {
    private final HttpClient client;

    public Client() {
        this.client = HttpClient.newBuilder().build();
    }

    public CompletableFuture<Record> sendTask(String url, byte[] requestPayload) {
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofByteArray(requestPayload))
                .uri(URI.create(url))
                .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofByteArray())
                .thenApply(HttpResponse::body)
                .thenApply(responseBody -> (Record) deserializeObject(responseBody));
    }
}