package com.lifdev.design_patterns_demo.factory;

import com.lifdev.design_patterns_demo.common.Payment;
import org.springframework.stereotype.Component;


import java.util.Map;

@Component
public class PaymentFactory {

    private final Map<String, Payment> payments;

    public PaymentFactory(Map<String, Payment> payments) {
        this.payments = payments;
    }

    public Payment getPayment(String type) {
        return payments.get(type);
    }
}
