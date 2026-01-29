package com.lifdev.design_patterns_demo.controller;

import com.lifdev.design_patterns_demo.builder.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    private  MaisonBuilder maisonBuilder;

    public BuilderController(MaisonBuilder maisonBuilder) {
        this.maisonBuilder = maisonBuilder;
    }

    @GetMapping("/maisonSimple")
    public String buildMaison() {
        Construction construction = new Construction();
        MaisonBuilder duplex = new SimpleMaisonBuilder();
        construction.setPizzaBuilder(duplex);
        construction.constructMaison();
        Maison maison=construction.getMaison();
        return maison.toString();
       /* return Maison.builder()
                .salons(1)
                .chambre(3)
                .etage(0)
                .piscine(true)
                .build()
                .toString();*/
    }
    @GetMapping("/maisonDuplex")
    public String buildDuplex() {
        Construction construction = new Construction();
        MaisonBuilder duplex = new DuplexMaisonBuilder();
        construction.setPizzaBuilder(duplex);
        construction.constructMaison();
        Maison maison=construction.getMaison();
        return maison.toString();


        /*return Maison.builder()
                .salons(2)
                .chambre(5)
                .etage(1)
                .piscine(true)
                .garage(true)
                .build()
                .toString();*/
    }
}
