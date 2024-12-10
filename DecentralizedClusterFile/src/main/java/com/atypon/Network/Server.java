package com.atypon.Network;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import static com.atypon.Message.Info.logServerStart;
import static com.atypon.Message.Info.logServerStop;
import static com.atypon.Message.Severe.logServerError;

public class Server {
    private static final String STATUS_ENDPOINT = "/status";
    private final int port;
    private HttpServer server;
    private final OnRequestCallback requestCallback;

    public Server(int port, OnRequestCallback requestCallback) {
        this.port = port;
        this.requestCallback = requestCallback;
    }

    public void startServer() {
        try {
            createServer();
            createContexts();
            startServerExecutor();
            logServerStart(port);
        } catch (IOException e) {
            logServerError(e);
        }
    }

    private void createServer() throws IOException {
        this.server = HttpServer.create(new InetSocketAddress(port), 0);
    }

    private void createContexts() {
        HttpContext statusContext = server.createContext(STATUS_ENDPOINT);
        HttpContext taskContext = server.createContext(requestCallback.getEndpoint());

        statusContext.setHandler(this::handleStatusCheckRequest);
        taskContext.setHandler(this::handleTaskRequest);
    }

    private void startServerExecutor() {
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    private void handleTaskRequest(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("post")) {
            exchange.close();
            return;
        }

        byte[] responseBytes = requestCallback.processRequestData(exchange.getRequestBody().readAllBytes());

        sendResponse(responseBytes, exchange);
    }

    private void handleStatusCheckRequest(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("get")) {
            exchange.close();
            return;
        }

        String responseMessage = "Good evening Dr. Motasem and Dr. Fahed. Just wanted to let you know that the server is up and running seamlessly.\n";
        sendResponse(responseMessage.getBytes(), exchange);
    }

    private void sendResponse(byte[] responseBytes, HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200, responseBytes.length);
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(responseBytes);
        outputStream.flush();
        outputStream.close();
    }

    public void stop() {
        server.stop(10);
        logServerStop();
    }
}