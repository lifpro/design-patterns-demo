package com.lifdev.design_patterns_demo.strategy;

import org.springframework.stereotype.Component;

@Component("mobile2")
public class MobileStrategy implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Strategy mobile : " + amount);
    }
}

