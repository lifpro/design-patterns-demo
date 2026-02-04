package com.lifdev.design_patterns_demo.state;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order advance(Order order) {
        order.next();
        return order;
    }
}

