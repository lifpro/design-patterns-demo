package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.facade.OrderFacade;
import com.lifdev.design_patterns_demo.prototype.PrototypeService;
import com.lifdev.design_patterns_demo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prototypes")
public class PrototypeController {

    private final PrototypeService prototype;
    public PrototypeController(PrototypeService prototype) {
        this.prototype = prototype;
    }

    @GetMapping("/duplicate")
    public void duplicate() {
        prototype.duplicate();
    }
}
