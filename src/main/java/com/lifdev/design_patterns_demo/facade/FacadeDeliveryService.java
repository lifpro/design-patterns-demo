package com.lifdev.design_patterns_demo.facade;

import org.springframework.stereotype.Service;

@Service
public class FacadeDeliveryService {
    public void deliver() {
        System.out.println("Livraison lancée");
    }
}

