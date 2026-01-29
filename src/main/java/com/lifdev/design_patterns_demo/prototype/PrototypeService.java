package com.lifdev.design_patterns_demo.prototype;
import org.springframework.stereotype.Service;

@Service
public class PrototypeService {
    public void duplicate(){
        Order original = new Order("Ordinateur", 2);
        Order copie = original.clone();
        System.out.println("original : " + original.toString());
        System.out.println("copie : " + copie.toString());
    }
}
