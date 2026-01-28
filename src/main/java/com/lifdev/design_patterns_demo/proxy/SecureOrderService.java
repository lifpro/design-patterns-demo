package com.lifdev.design_patterns_demo.proxy;

import org.springframework.stereotype.Service;

@Service
public class SecureOrderService {
    public void process() {
        System.out.println("Commande traitée");
    }
}
