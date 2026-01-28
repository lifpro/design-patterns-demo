package com.lifdev.design_patterns_demo.abstractfactory;

import com.lifdev.design_patterns_demo.common.Payment;

public class AfricaPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paiement Afrique : " + amount);
    }
}
