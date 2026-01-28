package com.lifdev.design_patterns_demo.observer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSubject {

    private final List<OrderObserver> observers;

    public OrderSubject(List<OrderObserver> observers) {
        this.observers = observers;
    }

    public void notifyAllObservers(String message) {
        observers.forEach(o -> o.update(message));
    }
}

