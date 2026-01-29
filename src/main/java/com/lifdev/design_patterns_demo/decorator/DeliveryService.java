package com.lifdev.design_patterns_demo.decorator;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    public String deliver() {
        Delivery delivery =
                new InsuranceDelivery(
                        new ExpressDelivery(
                                new BasicDelivery()
                        )
                );

        return delivery.deliver();
    }
}
