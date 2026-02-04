package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.factory.PaymentFactoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {

    private final PaymentFactoryService service;

    public FactoryController(PaymentFactoryService service) {
        this.service = service;
    }

    @GetMapping("/pay")
    public String pay() {
        service.pay("card", 5000);
        return "Paiement OK";
    }
}
