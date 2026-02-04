package com.lifdev.design_patterns_demo.state;

import com.lifdev.design_patterns_demo.common.OrderState;

public class Order {

    private OrderState state = new CreatedState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}

