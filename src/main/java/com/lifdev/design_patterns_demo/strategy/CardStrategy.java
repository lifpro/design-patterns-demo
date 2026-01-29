package com.lifdev.design_patterns_demo.strategy;

import org.springframework.stereotype.Component;

@Component("card2")
public class CardStrategy implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Strategy carte : " + amount);
    }
}
