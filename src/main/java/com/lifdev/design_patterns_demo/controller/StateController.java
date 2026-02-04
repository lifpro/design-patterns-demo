package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.observer.OrderService;
import com.lifdev.design_patterns_demo.state.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class StateController {

    private final OrderService service;
    private final Order order = new Order();

    public StateController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/next")
    public String next() {
        service.advance(order);
        return order.getStatus();
    }
}
