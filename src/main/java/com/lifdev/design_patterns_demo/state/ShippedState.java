package com.lifdev.design_patterns_demo.state;

import com.lifdev.design_patterns_demo.common.OrderState;

public class ShippedState implements OrderState {

    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    public String getStatus() {
        return "SHIPPED";
    }
}
