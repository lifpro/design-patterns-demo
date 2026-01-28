package com.lifdev.design_patterns_demo.abstractfactory;

import com.lifdev.design_patterns_demo.common.Invoice;
import com.lifdev.design_patterns_demo.common.Payment;
import org.springframework.stereotype.Component;

@Component("europe")
public class EuropeBillingFactory implements BillingFactory {
    public Payment createPayment() {
        return new EuropePayment();
    }
    public Invoice createInvoice() {
        return new EuropeInvoice();
    }
}
