package com.lifdev.design_patterns_demo.facade;

import com.lifdev.design_patterns_demo.facade.FacadeDeliveryService;
import com.lifdev.design_patterns_demo.facade.FacadeNotificationService;
import com.lifdev.design_patterns_demo.facade.FacadePaymentService;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {
    private final FacadePaymentService  paymentService;
    private final FacadeDeliveryService  deliveryService;
    private final FacadeNotificationService notificationService;
    public OrderFacade(FacadePaymentService paymentService,
                       FacadeDeliveryService deliveryService,
                       FacadeNotificationService notificationService) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }
    public void placeOrder(double amount) {
        paymentService.pay(amount);
        deliveryService.deliver();
        notificationService.notifyClient();
    }
}
