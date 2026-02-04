package com.lifdev.design_patterns_demo.observer;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderSubject subject;

    public OrderService(OrderSubject subject) {
        this.subject = subject;
    }

    public void validateOrder() {
        subject.notifyAllObservers("Commande validée");
    }
}

