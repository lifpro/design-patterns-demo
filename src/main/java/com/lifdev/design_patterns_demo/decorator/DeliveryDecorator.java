package com.lifdev.design_patterns_demo.decorator;

public abstract class DeliveryDecorator implements Delivery {
    protected Delivery delivery;
    public DeliveryDecorator(Delivery delivery) {
        this.delivery = delivery;
    }
}

