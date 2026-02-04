package com.lifdev.design_patterns_demo.common;

import com.lifdev.design_patterns_demo.state.Order;

public interface OrderState {
    void next(Order order);
    String getStatus();
}
