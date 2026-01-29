package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.decorator.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decorator")
public class DecoratorController {

    private final DeliveryService service;

    public DecoratorController(DeliveryService service) {
        this.service = service;
    }

    @GetMapping("/deliver")
    public String deliver() {
        return service.deliver();
    }
}

