package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.facade.OrderFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderFacade facade;

    public OrderController(OrderFacade facade) {
        this.facade = facade;
    }

    @GetMapping("/pay")
    public String pay() {
        facade.placeOrder("card", 5000);
        return "OK";
    }
}
