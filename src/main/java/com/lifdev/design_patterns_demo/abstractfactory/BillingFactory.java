package com.lifdev.design_patterns_demo.abstractfactory;

import com.lifdev.design_patterns_demo.common.Invoice;
import com.lifdev.design_patterns_demo.common.Payment;

public interface BillingFactory {
    Payment createPayment();
    Invoice createInvoice();
}

