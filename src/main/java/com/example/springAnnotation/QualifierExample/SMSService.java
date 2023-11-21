package com.example.springAnnotation.QualifierExample;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
