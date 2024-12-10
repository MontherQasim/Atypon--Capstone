package com.atypon.Network;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    private static final String HOME_PAGE_ENDPOINT = "/";
    private static final Logger logger = Logger.getLogger(Server.class.getName());

    private final int port;
    private final OnRequest requestCallback;

    public Server(int port, OnRequest requestCallback) {
        this.port = port;
        this.requestCallback = requestCallback;
    }

    public void startServer() {
        HttpServer server = createHttpServer();
        if (server == null) {
            return;
        }

        configureContexts(server);
        startHttpServer(server);
    }

    private HttpServer createHttpServer() {
        HttpServer server;
        try {
            server = HttpServer.create(new InetSocketAddress(port), 0);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error creating server", e);
            return null;
        }
        return server;
    }

    private void configureContexts(HttpServer server) {
        HttpContext taskContext = server.createContext(requestCallback.getEndpoint());
        taskContext.setHandler(this::handleTaskRequest);

        HttpContext homePageContext = server.createContext(HOME_PAGE_ENDPOINT);
        homePageContext.setHandler(this::handleRequestForAsset);

        server.setExecutor(Executors.newFixedThreadPool(8));
    }

    private void startHttpServer(HttpServer server) {
        server.start();
        logger.info("Server started on port " + port);
    }


    private void handleRequestForAsset(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("get")) {
            exchange.close();
            return;
        }

        byte[] response;

        String asset = exchange.getRequestURI().getPath();
        if (asset.equals(HOME_PAGE_ENDPOINT)) {
            response = readUiAsset("/index.html");
        } else {
            response = readUiAsset(asset);
        }
        sendResponse(response, exchange);
    }

    private byte[] readUiAsset(String asset) throws IOException {
        try (InputStream assetStream = getClass().getResourceAsStream(asset)) {
            if (assetStream == null) {
                return new byte[]{};
            }
            return assetStream.readAllBytes();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading UI asset", e);
            throw e;
        }
    }

    private void handleTaskRequest(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("post")) {
            exchange.close();
            return;
        }

        byte[] responseBytes = requestCallback.handleRequest(exchange.getRequestBody().readAllBytes());
        sendResponse(responseBytes, exchange);
    }

    private void sendResponse(byte[] responseBytes, HttpExchange exchange) throws IOException {
        try {
            exchange.sendResponseHeaders(200, responseBytes.length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(responseBytes);
            outputStream.flush();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error sending response", e);
            throw e;
        } finally {
            exchange.getResponseBody().close();
        }
    }
}