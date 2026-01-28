package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.abstractfactory.BillingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abstract-factory")
public class BillingController {

    private final BillingService service;

    public BillingController(BillingService service) {
        this.service = service;
    }

    @GetMapping("/pay")
    public String pay() {
        service.process("africa", 10000);
        return "OK";
    }
}
