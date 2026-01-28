package com.lifdev.design_patterns_demo.facade;

import com.lifdev.design_patterns_demo.observer.OrderSubject;
import com.lifdev.design_patterns_demo.strategy.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {

    private final PaymentService paymentService;
    private final OrderSubject subject;

    public OrderFacade(PaymentService paymentService, OrderSubject subject) {
        this.paymentService = paymentService;
        this.subject = subject;
    }

    public void placeOrder(String paymentType, double amount) {
        paymentService.pay(paymentType, amount);
        subject.notifyAllObservers("Commande validée");
    }
}
