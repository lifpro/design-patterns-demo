package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.observer.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/observer")
public class ObserverController {

    private final OrderService service;

    public ObserverController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/notify")
    public String notifyOrder() {
        service.validateOrder();
        return "Notifications envoyées";
    }
}
