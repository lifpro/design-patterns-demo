package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.strategy.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
public class StrategyController {

    private final PaymentService service;

    public StrategyController(PaymentService service) {
        this.service = service;
    }

    @GetMapping("/pay")
    public String pay() {
        service.pay("card", 8000);
        return "Paiement OK";
    }
}
