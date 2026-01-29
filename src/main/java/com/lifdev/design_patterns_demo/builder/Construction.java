package com.lifdev.design_patterns_demo.builder;

/** "Director" */
public class Construction
{
    private MaisonBuilder maisonBuilder;
    public void setPizzaBuilder(MaisonBuilder pb)
    {
        maisonBuilder = pb;
    }
    public Maison getMaison() {
        return maisonBuilder.getMaison();
    }
    public void constructMaison() {
        maisonBuilder.createMaison();
        maisonBuilder.addSalon();
        maisonBuilder.addEtage();

    }
}
