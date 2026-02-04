package com.lifdev.design_patterns_demo.state;

import com.lifdev.design_patterns_demo.common.OrderState;

public class DeliveredState implements OrderState {

    public void next(OrderContext context) {
        System.out.println("Commande déjà livrée");
    }

    public String getStatus() {
        return "DELIVERED";
    }
}

