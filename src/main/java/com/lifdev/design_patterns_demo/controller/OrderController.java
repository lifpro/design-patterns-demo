package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.facade.OrderFacade;
import com.lifdev.design_patterns_demo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderFacade facade;
    private  final OrderService orderService;

    public OrderController(OrderFacade facade,
                           OrderService orderService) {
        this.facade = facade;
        this.orderService=orderService;
    }

    @GetMapping("/pay")
    public String pay() {
        facade.placeOrder("card", 5000);
        return "OK";
    }
    @GetMapping("/singleton")
    public String createOrder() {
        return orderService.createOrder();

    }
}
