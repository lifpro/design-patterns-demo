package com.lifdev.design_patterns_demo.state;

import com.lifdev.design_patterns_demo.common.OrderState;

public class CreatedState implements OrderState {

    public void next(OrderContext context) {
        context.setState(new PaidState());
    }

    public String getStatus() {
        return "CREATED";
    }
}
