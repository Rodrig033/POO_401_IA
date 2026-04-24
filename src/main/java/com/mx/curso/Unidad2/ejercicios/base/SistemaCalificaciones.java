package com.mx.curso.Unidad2.ejercicios.base;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        int notaExamen = 100;

        if (notaExamen >= 60){
            System.out.println("Felcicidades has aprobado");
            if (notaExamen >= 90){
                System.out.println("Excelente desempeño");
            }
        } else {
            System.out.println("Lo sentimos, no has aprobado");
        }

        // Sentencia Switch
        char calificacionLiteral;
        switch (notaExamen){
            case 100:
            case 90:
                calificacionLiteral = 'A';
                break;
            case 80:
                calificacionLiteral = 'B';
                break;
            case 70:
                calificacionLiteral = 'C';
                break;
            case 60:
                calificacionLiteral = 'D';
                break;
            default:
                calificacionLiteral = 'F';
                break;
        }
        System.out.println("Tu calificación es: " + " " + calificacionLiteral);
    }
}
