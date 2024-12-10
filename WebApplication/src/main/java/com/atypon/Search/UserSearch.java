package com.atypon.Search;

import com.atypon.Network.OnRequest;
import com.atypon.Network.Server;
import com.atypon.ProtocolBuffer.SearchModel;
import com.atypon.Model.SearchRequest;
import com.atypon.Model.SearchResponse;
import com.atypon.Model.SearchResult;
import com.atypon.Network.Client;
import com.atypon.ServiceRegistry.ServiceRegistry;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserSearch implements OnRequest {
    private static final String ENDPOINT = "/documents_search";
    private final ObjectMapper objectMapper;
    private final Client client;
    private final ServiceRegistry searchCoordinatorRegistry;
    private static final Logger logger = Logger.getLogger(Server.class.getName());

    public UserSearch(ServiceRegistry searchCoordinatorRegistry) {
        this.searchCoordinatorRegistry = searchCoordinatorRegistry;
        this.client = new Client();
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
    }

    @Override
    public byte[] handleRequest(byte[] requestPayload) {
        try {
            SearchRequest frontendSearchRequest =
                    objectMapper.readValue(requestPayload, SearchRequest.class);

            SearchResponse frontendSearchResponse = createFrontendResponse(frontendSearchRequest);

            return objectMapper.writeValueAsBytes(frontendSearchResponse);
        } catch (IOException e) {
            logger.severe("Error handling request: {" + e.getMessage() +"}");
            return new byte[0];
        }
    }

    private SearchResponse createFrontendResponse(SearchRequest frontendSearchRequest) {
        SearchModel.Response searchClusterResponse = sendRequestToSearchCluster(frontendSearchRequest.getSearchQuery());

        List<SearchResult> filteredResults = filterResults(searchClusterResponse);

        return new SearchResponse(filteredResults);
    }

    private List<SearchResult> filterResults(SearchModel.Response searchClusterResponse) {
        List<SearchResult> searchResultList = new ArrayList<>();

        for (int i = 0; i < searchClusterResponse.getRelevantDocumentsCount(); i++) {
            String documentName = searchClusterResponse.getRelevantDocuments(i).getDocumentName();
            String title = getDocumentTitle(documentName);

            SearchResult resultInfo = new SearchResult(title, searchClusterResponse.getRelevantDocuments(i).getScore());
            searchResultList.add(resultInfo);
        }

        return searchResultList;
    }

    @Override
    public String getEndpoint() {
        return ENDPOINT;
    }

    private static String getDocumentTitle(String document) {
        return document.split("\\.")[0];
    }

    private SearchModel.Response sendRequestToSearchCluster(String searchQuery) {
        SearchModel.Request searchRequest = SearchModel.Request.newBuilder()
                .setSearchQuery(searchQuery)
                .build();

        try {
            String coordinatorAddress = searchCoordinatorRegistry.getRandomServiceAddress();
            if (coordinatorAddress == null) {
                logger.severe("Search Cluster Coordinator is unavailable");
                return SearchModel.Response.getDefaultInstance();
            }

            byte[] payloadBody = client.sendTask(coordinatorAddress, searchRequest.toByteArray()).join();
            return SearchModel.Response.parseFrom(payloadBody);
        } catch (InterruptedException | KeeperException | IOException e) {
            logger.severe("Error sending request to search cluster: {" + e.getMessage() + "}");
            return SearchModel.Response.getDefaultInstance();
        }
    }
}