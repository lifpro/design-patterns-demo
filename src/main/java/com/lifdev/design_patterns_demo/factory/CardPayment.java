package com.lifdev.design_patterns_demo.factory;

import com.lifdev.design_patterns_demo.common.Payment;
import org.springframework.stereotype.Component;

@Component("card")
public class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paiement carte : " + amount);
    }
}
