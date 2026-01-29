package com.lifdev.design_patterns_demo.adapter;

import com.lifdev.design_patterns_demo.common.Payment;
import org.springframework.stereotype.Component;

@Component
public class ExternalPaymentAdapter implements Payment {

    private final ExternalPaymentApi api = new ExternalPaymentApi();

    @Override
    public void pay(double amount) {
        api.sendPayment(amount);
    }
}

