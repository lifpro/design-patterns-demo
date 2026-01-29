package com.lifdev.design_patterns_demo.builder;

public class SimpleMaisonBuilder extends MaisonBuilder{

    @Override
    public void createMaison() {

    }

    @Override
    public void addEtage() {
        maison.setEtage(0);
    }

    @Override
    public void addSalon() {
        maison.setSalons(1);
    }
}
