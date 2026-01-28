package com.lifdev.design_patterns_demo.observer;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements OrderObserver {
    public void update(String message) {
        System.out.println("EMAIL : " + message);
    }
}

