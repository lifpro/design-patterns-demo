package com.lifdev.design_patterns_demo.abstractfactory;

import com.lifdev.design_patterns_demo.common.Invoice;
import com.lifdev.design_patterns_demo.common.Payment;
import org.springframework.stereotype.Component;

@Component("africa")
public class AfricaBillingFactory implements BillingFactory {
    public Payment createPayment() {
        return new AfricaPayment();
    }
    public Invoice createInvoice() {
        return new AfricaInvoice();
    }
}
