package com.mx.curso.Unidad2.manejo_ciclos;

import java.util.ArrayList;

public class ControlAdicional {
    public static boolean encontrarNumero(int[] numeros, int objetivo){
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == objetivo) {
                System.out.println("El número " + objetivo + " fue encontrado en la posición " + i);
                return true;
            }
        }
        System.out.println("El número " + objetivo + " no ha sido encontrado." );
        return false;
    }

    public static void main(String[] args) {

        System.out.println("--- Secuencia hasta 5 ---");
        for (int i = 1; i < 11; i++){
            System.out.println(i);
            if (i == 5){
                break;
            }
        }

        System.out.println("--- Número impares ---");
        for (int i = 1; i < 11; i++){
            if (i % 2 == 0){
                continue;
            } else {
                System.out.println(i);
            }
        }

        System.out.println("--- Encontrar números ---");
        int numeros[] = {1, 12, 33, 14, 95, 6, 21};
        int objetivo = 95;
        System.out.print("Lista = { ");
        for(int i = 0; i < numeros.length; i++){
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.print(" }");


        System.out.println();
        System.out.println("Objetivo: " + objetivo);
        encontrarNumero(numeros, objetivo);

    }
}
