package com.example.notificationservice.dto;

import lombok.Data;

@Data
public class NotificationRequest {
    private String type;
    private String recipientEmail;
    private String message;
}
