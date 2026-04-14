package com.mx.curso.Unidad2.practicas_poo.productos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Productos> productos = new ArrayList<>();

        Electronica lavadora = new Electronica("Lavadora", 10000, "A12B3C4");
        Electronica cafetera = new Electronica("Cafetera", 5000, "B44S7F9");
        Electronica television = new Electronica("Televisión", 11000, "P0Y7Z1");
        Electronica plancha = new Electronica("Plancha", 500, "W91R45Z");
        Alimentos pan = new Alimentos("Pan Bimbo", 100, "10/05/2026");
        Alimentos huevos = new Alimentos("Huevos", 70, "20/04/2026");
        Alimentos jamon = new Alimentos("Jamón", 80, "1/05/2026");
        Alimentos yoghurt = new Alimentos("Chobani", 160, "26/04/2026");

        productos.add(lavadora);
        productos.add(cafetera);
        productos.add(television);
        productos.add(plancha);
        productos.add(pan);
        productos.add(huevos);
        productos.add(jamon);
        productos.add(yoghurt);

        for (Productos producto: productos){
            producto.mostrarDetalles();
                System.out.println("---------------------");
        }


    }
}
