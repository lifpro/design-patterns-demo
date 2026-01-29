package com.lifdev.design_patterns_demo.decorator;

public class InsuranceDelivery extends DeliveryDecorator {

    public InsuranceDelivery(Delivery delivery) {
        super(delivery);
    }

    public String deliver() {
        return delivery.deliver() + " + Assurance";
    }
}

