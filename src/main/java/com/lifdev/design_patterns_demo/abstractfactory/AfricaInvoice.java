package com.lifdev.design_patterns_demo.abstractfactory;

import com.lifdev.design_patterns_demo.common.Invoice;

public class AfricaInvoice implements Invoice {
    public void generate(double amount) {
        System.out.println("Facture Afrique : " + amount);
    }
}
