package com.mx.curso.Unidad1.ciclos;
import java.util.Scanner;


public class AnalizadorDeNumeros {
    public static void main(String[] args) {
        int suma = 0;
        int num = 1;
        int contraseña = 1234;
        for (int i = 1; i <= 100; i++){
            suma += i;
        }
        System.out.println("La suma es: " + suma);

        // X > 50
        while (num <= 50){
            num += 1;
            if (num > 50){
                System.out.println("El número es: " + num);
            }
        }
        // Validar contraseña:
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Ingrese la contraseña: ");
            number = scanner.nextInt();
            if (number != contraseña){
                System.out.println("Contraseña incorrecta...");
            }

        } while (number != contraseña);
            System.out.println("¡Has ingresado al sistema!");


    }
}
