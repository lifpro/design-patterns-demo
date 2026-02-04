package com.lifdev.design_patterns_demo.factory;

import com.lifdev.design_patterns_demo.common.Payment;
import org.springframework.stereotype.Component;

@Component("wave")
public class WavePayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paiement wave : " + amount);
    }
}
