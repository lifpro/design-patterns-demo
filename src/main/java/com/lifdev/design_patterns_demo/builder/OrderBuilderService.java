package com.lifdev.design_patterns_demo.builder;

import org.springframework.stereotype.Service;

@Service
public class OrderBuilderService {

    public Order createOrder() {
        return new Order.Builder()
                .product("PC Portable")
                .quantity(1)
                .price(750000)
                .giftWrap(true)
                .deliveryMode("EXPRESS")
                .build();
    }
}

