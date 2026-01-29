package com.lifdev.design_patterns_demo.builder;

import lombok.Builder;
import lombok.NoArgsConstructor;

//@Builder
@NoArgsConstructor
public class Maison {
    private int surface;
    private int salons;
    private int chambre;
    private int douche;
    private int etage;
    private boolean garage;
    private boolean jardin;
    private boolean piscine;

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void setSalons(int salons) {
        this.salons = salons;
    }

    public void setChambre(int chambre) {
        this.chambre = chambre;
    }

    public void setDouche(int douche) {
        this.douche = douche;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
