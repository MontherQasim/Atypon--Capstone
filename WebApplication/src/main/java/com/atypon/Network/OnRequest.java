package com.atypon.Network;

public interface OnRequest {

    byte[] handleRequest(byte[] requestPayload);

    String getEndpoint();
}