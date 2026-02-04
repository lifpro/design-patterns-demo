package com.lifdev.design_patterns_demo.factory;

import org.springframework.stereotype.Service;

@Service("sfactory")
public class PaymentFactoryService {

    private final PaymentFactory factory;

    public PaymentFactoryService(PaymentFactory factory) {
        this.factory = factory;
    }

    public void pay(String type, double amount) {
        factory.getPayment(type).pay(amount);
    }
}
