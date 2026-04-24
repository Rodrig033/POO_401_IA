package com.mx.curso.Unidad3.practica_02;

import java.util.Scanner;

public class Resultados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String estadoResultados = " ";

        while (!estadoResultados.equals("Listo para revisión")){
            System.out.print("Estado de resultados: ");
            estadoResultados = scanner.nextLine();
            if (estadoResultados.equals("En proceso")){
                continue;
            } else if (estadoResultados.equals("Error en muestra")) {
                System.out.println("Verificaremos tu muestra de nuevo...");
                break;
            } else if (estadoResultados.equals("Listo para revisión")) {
                System.out.println("¡Tus resultados se han registrado con éxito!");
            }
        }
        System.out.println("Fin de la revisión");
        scanner.close();
    }
}
