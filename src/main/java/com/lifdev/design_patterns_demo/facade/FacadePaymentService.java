package com.lifdev.design_patterns_demo.facade;

import org.springframework.stereotype.Service;

@Service
public class FacadePaymentService {
    public void pay(double amount) {
        System.out.println("Paiement : " + amount);
    }
}

