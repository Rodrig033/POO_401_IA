package com.mx.curso.Unidad3.practica_02;

import java.util.Scanner;

public class Paciente {
    public static boolean validarIDPaciente(int id){
        int longitud = String.valueOf(id).length();
        if (longitud == 5){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int id;
        boolean esValido;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese el ID: ");
            id = scanner.nextInt();
            esValido = validarIDPaciente(id);
            if (!esValido) {
                System.out.println("Formato de ID inválido. Debe tener 5 dígitos.");
            }
        } while (!esValido);
        System.out.println("¡Formato de ID válido!");
        scanner.close();
    }
}


