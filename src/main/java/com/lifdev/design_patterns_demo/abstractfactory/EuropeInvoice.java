package com.lifdev.design_patterns_demo.abstractfactory;

import com.lifdev.design_patterns_demo.common.Invoice;

public class EuropeInvoice implements Invoice {
    public void generate(double amount) {
        System.out.println("Facture Europe : " + amount);
    }
}
