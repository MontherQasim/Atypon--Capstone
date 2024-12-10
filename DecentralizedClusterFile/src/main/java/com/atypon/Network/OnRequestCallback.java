package com.atypon.Network;

public interface OnRequestCallback {
    byte[] processRequestData(byte[] requestPayload);

    String getEndpoint();
}