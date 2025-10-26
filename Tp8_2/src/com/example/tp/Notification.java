package com.example.tp;

public interface Notification {
    void send(String recipient, String message);
    int getPriority();  // 0=basse, 1=normale, 2=haute
    String getType();
}
