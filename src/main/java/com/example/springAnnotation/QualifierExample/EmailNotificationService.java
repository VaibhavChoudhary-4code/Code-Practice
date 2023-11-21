package com.example.springAnnotation.QualifierExample;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
