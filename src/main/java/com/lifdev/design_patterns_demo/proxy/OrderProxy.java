package com.lifdev.design_patterns_demo.proxy;

import org.springframework.stereotype.Service;

@Service
public class OrderProxy {

    private final SecureOrderService service;

    public OrderProxy(SecureOrderService service) {
        this.service = service;
    }

    public void process(String role) {
        if (!"ADMIN".equals(role)) {
            throw new RuntimeException("Accès refusé");
        }
        service.process();
    }
}
