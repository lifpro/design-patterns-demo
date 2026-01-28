package com.lifdev.design_patterns_demo.prototype;

public class Order implements Prototype<Order> {

    private String product;
    private int quantity;

    public Order(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public Order clone() {
        return new Order(this.product, this.quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
