package com.mx.curso.Unidad1.ciclos;
import java.util.Scanner;


public class ProcesadorDeListas {
    public static void main(String[] args) {
        String [] frutas = {"manzana", "banana", "pera", "uva"};
        int contador = 0;
        boolean encontrado = false;


        for (String fruta: frutas){
            System.out.println(fruta);
        }

        // Buscar la letra p:




        // Encontrar una fruta en el arreglo:
        Scanner scanner = new Scanner(System.in);
        String nombre;
        do {
            System.out.print("Ingresa una fruta: ");
            nombre = scanner.next();

            for (String fruta : frutas) {
                if (frutas[contador].equals(nombre)) {
                    System.out.println("Fruta " + nombre + " encontrada en la posición " + contador);
                    encontrado = true;
                    break;
                }
                contador ++;
            }
            } while (encontrado != true);
        }
    }

