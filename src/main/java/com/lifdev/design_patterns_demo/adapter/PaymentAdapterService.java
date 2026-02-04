package com.lifdev.design_patterns_demo.adapter;

import com.lifdev.design_patterns_demo.common.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentAdapterService {

    private final Payment payment;

    public PaymentAdapterService(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }
}
