package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.facade.OrderFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facade")
public class FacadeController {
    private final OrderFacade facade;
    public FacadeController(OrderFacade facade) {
        this.facade = facade;
    }
    @GetMapping("/order")
    public String order() {
        facade.placeOrder(15000);
        return "Commande OK";
    }
}
