package com.mx.curso.Unidad3.practicas_01.datos_producto;

import java.util.Scanner;

public class SistemaAutenticacion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passwordCorrecto = "pass123";

        boolean autenticado = false;

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("Intento " + intento);

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto)) {

                if (password.equals(passwordCorrecto)) {
                    System.out.println("Autenticación exitosa :)");
                    autenticado = true;
                    break;
                } else {
                    System.out.println("Contraseña incorrecta >:(");
                }

            } else {
                System.out.println("Usuario no encontrado :( ");
            }
        }

        if (!autenticado) {
            System.out.println("Demasiados intentos. Acceso denegado.");
        }
        scanner.close();
    }
}