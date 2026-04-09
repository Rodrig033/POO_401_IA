package com.mx.curso.Unidad2.actividades_indp.zoologico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Perro bolt = new Perro("Woooof");
        Gato garfield = new Gato("Odio los lunes");

        bolt.getSonido();
        garfield.getSonido();
        System.out.println("--- Sets ---");
        bolt.setSonido("También puedo hablar...");
        garfield.setSonido("¡Quiero lasagna!");

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(bolt);
        animales.add(garfield);

        // El polimorfismo
        System.out.println("--- Polimorfismo y sobrescritura ---");
        for (Animal a: animales){
            a.hacerSonido();
        };

    }
}
