package com.atypon.Network;

import java.io.*;

import static com.atypon.Message.Severe.logDeserializationError;
import static com.atypon.Message.Severe.logSerializationError;

public class ObjectStreamHandler {

    public static byte[] serializeObject(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutput objectOutput = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutput.writeObject(object);
            objectOutput.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            logSerializationError(e);
        }
        return new byte[]{};
    }
    public static Object deserializeObject(byte[] data) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
             ObjectInput objectInput = new ObjectInputStream(byteArrayInputStream)) {
            return objectInput.readObject();
        } catch (ClassNotFoundException | IOException e) {
            logDeserializationError(e);
        }
        return null;
    }
}