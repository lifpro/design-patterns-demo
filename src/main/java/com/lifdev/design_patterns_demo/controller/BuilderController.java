package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.builder.Order;
import com.lifdev.design_patterns_demo.builder.OrderBuilderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    private final OrderBuilderService service;

    public BuilderController(OrderBuilderService service) {
        this.service = service;
    }

    @GetMapping("/order")
    public Order buildOrder() {
        return service.createOrder();
    }
}
