package com.atypon.Message;

import java.util.logging.Logger;

import com.atypon.ProtocolBuffer.SearchClusterProtos;

import static com.atypon.Message.Colours.colorizeGreen;

public class Data {
    private static final Logger dataLogger = Logger.getLogger("DataLogger");
    public static void keywordBasedSearchRequest(SearchClusterProtos.Request request) {
        dataLogger.info(colorizeGreen("Keyword based search:\n" + request.getQuery()));
    }
    public static void KeywordBasedSearchResponse(SearchClusterProtos.Response response) {
        dataLogger.info(colorizeGreen("Keyword based search response:\n" + response.getAllFields()));
    }
    public static void CurrentClusterEndpoints(String endpoints) {
        dataLogger.info(colorizeGreen("Current cluster endpoints: {" + endpoints + "}"));
    }
}