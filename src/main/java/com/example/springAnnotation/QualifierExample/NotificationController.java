package com.example.springAnnotation.QualifierExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationController {
    private final NotificationService notificationService;

    @Autowired
    public NotificationController(@Qualifier("emailService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }
}
