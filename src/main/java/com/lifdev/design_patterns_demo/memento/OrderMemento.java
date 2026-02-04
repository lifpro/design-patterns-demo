package com.lifdev.design_patterns_demo.memento;

public class OrderMemento {
    private final String status;
    public OrderMemento(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}
