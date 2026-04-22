package com.mx.curso.Unidad3.datos_producto;

import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {
        ArrayList<Integer> cantidadStock = new ArrayList<>();
        cantidadStock.add(10);
        cantidadStock.add(20);
        cantidadStock.add(1);
        cantidadStock.add(220);
        cantidadStock.add(40);
        cantidadStock.add(50);
        cantidadStock.add(0);
        cantidadStock.add(100);
        cantidadStock.add(6);
        cantidadStock.add(15);


        int categoria;
        for (Integer cantidad: cantidadStock) {

            if (cantidad > 50) {
                categoria = 3;
            } else if (cantidad >= 10) {
                categoria = 2;
            } else if (cantidad >= 1) {
                categoria = 1;
            } else {
                categoria = 0;
            }

            System.out.print("Cantidad: " + cantidad + " - Estado: ");


            switch (categoria) {
                case 3:
                    System.out.println("En stock");
                    break;
                case 2:
                    System.out.println("Bajo stock");
                    break;
                case 1:
                    System.out.println("Urgente");
                    break;
                case 0:
                    System.out.println("Descontinuado");
                    break;
                default:
                    System.out.println("Categoría desconocida...");
            }
        }
    }
}
