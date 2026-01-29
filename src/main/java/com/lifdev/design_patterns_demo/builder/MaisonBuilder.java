package com.lifdev.design_patterns_demo.builder;

abstract public class MaisonBuilder {
    protected Maison maison;

    public Maison getMaison() {
        return maison;
    }
    void create(){
        maison=new Maison();
    }
    public abstract  void  createMaison();
    public abstract  void  addEtage();
    public abstract  void  addSalon();

}
