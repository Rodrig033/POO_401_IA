package com.mx.curso.Unidad2.excepciones.calculadoraPromedio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1;
        double nota2;

        try {
            System.out.print("Ingresa tu primera nota: ");
            nota1 = scanner.nextDouble();
            System.out.print("Ingresa tu segunda nota: ");
            nota2 = scanner.nextDouble();
            if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100){
                System.out.println("Las notas deben de estar entre 0 y 100");
            } else {
                double promedio = (nota1 + nota2) / 2;
                System.out.println("Tu promedio es de " + promedio + " puntos.");
            }
        } catch (InputMismatchException error){
            System.out.println("Oops, algo ha salido mal :(");
            System.out.println("Error: Ingresa solo números (pueden ser decimales)");
        } finally {
            scanner.close();
        }
    }
}
