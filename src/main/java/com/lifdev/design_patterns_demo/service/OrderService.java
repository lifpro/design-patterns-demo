package com.lifdev.design_patterns_demo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String createOrder() {
        return "Commande créée";
    }
}
