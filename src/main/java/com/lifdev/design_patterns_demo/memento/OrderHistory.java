package com.lifdev.design_patterns_demo.memento;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class OrderHistory {

    private Stack<OrderMemento> history = new Stack<>();
    public void save(OrderMemento memento) {
        history.push(memento);
    }
    public OrderMemento undo() {
        return history.pop();
    }
}
