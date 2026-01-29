package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.proxy.OrderProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy")
public class ProxyController {

    private final OrderProxy proxy;

    public ProxyController(OrderProxy proxy) {
        this.proxy = proxy;
    }

    @GetMapping("/process")
    public String process() {
        proxy.process("ADMIN");
        return "OK";
    }
}
