package com.lifdev.design_patterns_demo.abstractfactory;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BillingService {

    private final Map<String, BillingFactory> factories;

    public BillingService(Map<String, BillingFactory> factories) {
        this.factories = factories;
    }

    public void process(String zone, double amount) {
        BillingFactory factory = factories.get(zone);
        factory.createPayment().pay(amount);
        factory.createInvoice().generate(amount);
    }
}
