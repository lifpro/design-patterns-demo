package com.lifdev.design_patterns_demo.factory;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentFactory factory;

    public PaymentService(PaymentFactory factory) {
        this.factory = factory;
    }

    public void pay(String type, double amount) {
        factory.getPayment(type).pay(amount);
    }
}
