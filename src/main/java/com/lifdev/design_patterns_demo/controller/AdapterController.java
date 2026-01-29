package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.adapter.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adapter")
public class AdapterController {

    private final PaymentService service;

    public AdapterController(PaymentService service) {
        this.service = service;
    }

    @GetMapping("/pay")
    public String pay() {
        service.process(7000);
        return "Paiement OK";
    }
}

