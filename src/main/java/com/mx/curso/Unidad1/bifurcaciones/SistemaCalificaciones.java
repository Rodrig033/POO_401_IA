package com.mx.curso.Unidad1.bifurcaciones;
import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su calificación: ");

        int notaExamen = scanner.nextInt();

        if (notaExamen < 0 || notaExamen > 100){
            System.out.println("La nota es inválida.");
            return;
        }



        if (notaExamen >= 60){
            System.out.println("¡Felicidades, has aprobado!");
            if (notaExamen >= 90){
                System.out.println("¡Excelente desempeño!");
            }
        } else {
            System.out.println("Lo sentimos, no has aprobado.");
        }

        switch (notaExamen / 10){
            case 10:
            case 9:
                System.out.println("Tu calificación es: A");
                break;
            case 8:
                System.out.println("Tu calificación es: B");
                break;
            case 7:
                System.out.println("Tu calificación es: C");
                break;
            case 6:
                System.out.println("Tu calificación es: D");
                break;
            default:
                System.out.println("Tu calificación es: F");
                break;

        }
        scanner.close();
    }
}
