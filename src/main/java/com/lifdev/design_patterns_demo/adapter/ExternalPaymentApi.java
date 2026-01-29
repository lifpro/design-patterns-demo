package com.lifdev.design_patterns_demo.adapter;

public class ExternalPaymentApi {
    public void sendPayment(double value) {
        System.out.println("Paiement via API externe : " + value);
    }
}
