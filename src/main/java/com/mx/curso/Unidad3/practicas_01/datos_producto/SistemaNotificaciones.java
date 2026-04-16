package com.mx.curso.Unidad3.practicas_01.datos_producto;
import java.util.Scanner;

public class SistemaNotificaciones {

    public static boolean validarEmail(String email) {

        if (email == null || email.isEmpty()) {
            return false;

        } else if (!email.contains("@")) {
            return false;

        } else if (!email.contains(".")) {
            return false;
        }

        int posicionArroba = email.indexOf("@");
        int posicionPunto = email.lastIndexOf(".");

        if (posicionArroba > posicionPunto) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        boolean esValido;

        do {
            System.out.print("Ingrese su correo electrónico: ");
            email = scanner.nextLine();
            esValido = validarEmail(email);

            if (!esValido) {
                System.out.println("Correo inválido. Intente nuevamente.");
            }

        } while (!esValido);

        System.out.println("Correo válido registrado correctamente.");
        scanner.close();
    }
}