package com.mx.curso.Unidad2.interfaces.practica05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProcesadorListas {
    public static void main(String[] args) {

        String[] frutas = {"Uva", "Manzana", "Pera", "Sandia"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + " " + frutas[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la fruta: ");
        String fruta = scanner.nextLine();
        System.out.println("La fruta ingresada es " + fruta);

        int posicion = 0;
        boolean encontrado = false;

        do {
            if (frutas[posicion].equalsIgnoreCase(fruta)) {
                encontrado = true;
                System.out.println("Fruta encontrada en la posición " + posicion);
            }
            posicion++;
        } while (!encontrado && posicion < frutas.length);

        if (!encontrado) {
            System.out.println("Fruta no encontrada");
        }

}
}
