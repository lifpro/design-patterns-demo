package com.lifdev.design_patterns_demo.facade;

import org.springframework.stereotype.Service;

@Service
public class FacadeNotificationService {
    public void notifyClient() {
        System.out.println("Client notifié");
    }
}
