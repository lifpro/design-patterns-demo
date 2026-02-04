package com.lifdev.design_patterns_demo.state;

import com.lifdev.design_patterns_demo.common.OrderState;

public class PaidState implements OrderState {

    public void next(OrderContext context) {
        context.setState(new DeliveredState());
    }

    public String getStatus() {
        return "PAID";
    }
}
