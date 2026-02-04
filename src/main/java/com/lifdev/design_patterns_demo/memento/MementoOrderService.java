package com.lifdev.design_patterns_demo.memento;

import org.springframework.stereotype.Service;

@Service
public class MementoOrderService {
    private final OrderHistory history;
    public MementoOrderService(OrderHistory history) {
        this.history = history;
    }
    public Order updateOrder(Order order, String newStatus) {
        history.save(order.save());
        order.setStatus(newStatus);
        return order;
    }
    public Order undo(Order order) {
        order.restore(history.undo());
        return order;
    }
}
