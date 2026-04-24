package com.mx.curso.Unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        int anioActual = 2026;
        Scanner scanner = new Scanner(System.in);

        // Usar el bloque Try Catch : Me permite capturar los errores

        try {
            System.out.print("Ingrese su año de nacimiento: ");
            int anioNacimiento = scanner.nextInt();

            if (anioNacimiento > anioActual || anioNacimiento < 1900){
                System.out.println("Año inválido.");
            } else {
                int edad = anioActual - anioNacimiento;
                System.out.println("Su edad es de " + edad + " años.");
            }
        } catch (InputMismatchException error) {
            System.out.println("Opps, algo ocurrió mal :(");
            System.out.println("Ingresa tu año de nacimiento -> Número ");
        } finally {
            scanner.close();
        }
}
}
