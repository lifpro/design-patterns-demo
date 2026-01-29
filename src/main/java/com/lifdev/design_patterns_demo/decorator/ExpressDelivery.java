package com.lifdev.design_patterns_demo.decorator;

public class ExpressDelivery extends DeliveryDecorator {
    public ExpressDelivery(Delivery delivery) {
        super(delivery);
    }
    public String deliver() {
        return delivery.deliver() + " + EXPRESS";
    }
}

