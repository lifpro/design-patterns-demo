package com.lifdev.design_patterns_demo.memento;

public class Order {
    private String status;
    public Order(String status) {
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public OrderMemento save() {
        return new OrderMemento(status);
    }
    public void restore(OrderMemento memento) {
        this.status = memento.getStatus();
    }
    public String getStatus() {
        return status;
    }
}
