package com.aysekarapinar.ibb_ecodation_javafx.dto;

import java.time.LocalDateTime;

public class NotificationDTO {
    private int id;
    private String message;
    private String type;
    private LocalDateTime createdAt;

    public NotificationDTO() {}

    public NotificationDTO(String message, String type, LocalDateTime createdAt) {
        this.message = message;
        this.type = type;
        this.createdAt = createdAt;
    }

    public NotificationDTO(int id, String message, String type, LocalDateTime createdAt) {
        this.id = id;
        this.message = message;
        this.type = type;
        this.createdAt = createdAt;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
