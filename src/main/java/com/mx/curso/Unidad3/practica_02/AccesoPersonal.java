package com.mx.curso.Unidad3.practica_02;

import java.util.Scanner;

public class AccesoPersonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean autenticado = false;

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("Intento " + intento);

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

                if (usuario.equals("medico1") && password.equals("doc123")) {
                    System.out.println("Acceso de Médico exitoso");
                    autenticado = true;
                    break;
                } else if (usuario.equals("enfermera2") && password.equals("enf456")) {
                    System.out.println("Acceso de Enfermera exitoso");
                    autenticado = true;
                    break;
                } else {
                    System.out.println("Credenciales incorrectas");
                }
        }
        if (!autenticado) {
            System.out.println("Demasiados intentos. Acceso denegado.");
        }
        scanner.close();

    }
}
