package com.atypon.Collaborator;

import com.atypon.ProtocolBuffer.SearchClusterProtos;
import com.google.protobuf.InvalidProtocolBufferException;
import com.atypon.Cluster.ServiceRegistry;
import com.atypon.Model.Action;
import com.atypon.Model.Record;
import com.atypon.Network.OnRequestCallback;
import com.atypon.Network.Client;
import org.apache.zookeeper.KeeperException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.atypon.Message.Data.KeywordBasedSearchResponse;
import static com.atypon.Message.Data.keywordBasedSearchRequest;
import static com.atypon.Message.Severe.logRequestError;
import static com.atypon.Document.DocumentPartitioner.checkWorkers;
import static com.atypon.Document.DocumentPartitioner.generateActionList;
import static com.atypon.Network.ObjectStreamHandler.serializeObject;
import static com.atypon.Collaborator.Assistant.calculateResults;

public class Coordinator implements OnRequestCallback {
    private static final String ENDPOINT = "/Collaborator";
    private final ServiceRegistry workersServiceRegistry;
    private final Client client;

    public Coordinator(ServiceRegistry workersServiceRegistry, Client client) {
        this.workersServiceRegistry = workersServiceRegistry;
        this.client = client;
    }

    @Override
    public byte[] processRequestData(byte[] requestData) {
        try {
            SearchClusterProtos.Request request = SearchClusterProtos.Request.parseFrom(requestData);
            keywordBasedSearchRequest(request);
            SearchClusterProtos.Response response = createResponse(request);
            KeywordBasedSearchResponse(response);
            return response.toByteArray();
        } catch (InvalidProtocolBufferException | KeeperException | InterruptedException e) {
            logRequestError(e);
            return SearchClusterProtos.Response.getDefaultInstance().toByteArray();
        }
    }

    private SearchClusterProtos.Response createResponse(SearchClusterProtos.Request searchRequest) throws KeeperException, InterruptedException {
        SearchClusterProtos.Response.Builder searchResponse = SearchClusterProtos.Response.newBuilder();
        List<String> searchTerms = fetchWordsFromLine(searchRequest.getQuery());
        List<String> workers = workersServiceRegistry.getAllServiceEndpoints();
        checkWorkers(searchResponse, workers);
        List<Action> actions = generateActionList(workers.size(), searchTerms);
        List<Record> records = processTasks(workers, actions);
        List<SearchClusterProtos.Response.DocumentStats> sortedDocuments = calculateResults(records, searchTerms);
        searchResponse.addAllDocuments(sortedDocuments);
        return searchResponse.build();
    }

    @Override
    public String getEndpoint() {
        return ENDPOINT;
    }

    private List<Record> processTasks(List<String> workers, List<Action> actions) {
        List<CompletableFuture<Record>> futures = IntStream.range(0, workers.size())
                .mapToObj(index -> {
                    byte[] payload = serializeObject(actions.get(index));
                    return client.sendTask(workers.get(index), payload);
                })
                .collect(Collectors.toList());
        return getResults(futures);
    }

    private List<Record> getResults(List<CompletableFuture<Record>> futures) {
        return futures.stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
    public static List<String> fetchWordsFromLine(String line) {
        return Arrays.asList(line.split("[.\\s,\\-?!;:/]+"));
    }
}