package com.mx.curso.Unidad3.practica_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DatosCita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Bienvenido al IMSS ----");
        try {
            System.out.print("Ingresa la hora de la cita: ");
            int horaCita = scanner.nextInt();
            System.out.print("Ingresa el día de la semana: ");
            String diaSemana = scanner.next();

            if (horaCita < 9 || horaCita > 17){
                System.out.println("Error: No hay citas en este horario.");
            } else if (diaSemana.equals("Sabado") || diaSemana.equals("Domingo")) {
                System.out.println("Error: Cita fuera de los días laborales.");
            } else {
                System.out.println("Cita agendada con éxito");
            }
        }catch (InputMismatchException e){
            System.out.println("Error de tipo al agendar la hora (debe ser un número entero)...");
        }
        scanner.close();
    }
}
