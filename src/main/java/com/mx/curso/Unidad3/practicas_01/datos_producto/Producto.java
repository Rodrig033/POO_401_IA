package com.mx.curso.Unidad3.practicas_01.datos_producto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String producto;
        int cantidadStock;
        double precioUnitario;

        try {
            System.out.print("Ingresa el nombre del producto: ");
            producto = scanner.nextLine();
            System.out.print("Ingresa la cantidad: ");
            cantidadStock = scanner.nextInt();
            System.out.print("Ingresa el precio unitario: ");
            precioUnitario = scanner.nextDouble();
            if (cantidadStock <= 0 && precioUnitario <= 0){
                System.out.println("Cantidad y precio inválidos...");
            } else if (cantidadStock <= 0) {
                System.out.println("Cantidad incorrecta de productos...");
            } else if (precioUnitario <= 0) {
                System.out.println("Precio inválido…");
            } else {
                System.out.println("Usted ha elegido " + cantidadStock + " unidades de " + producto + " con un costo de $" + precioUnitario);
            }

        } catch (InputMismatchException error){
            System.out.println("Oops, algo ha salido mal :( ");
            System.out.println("Error: Ingresa solo números (pueden ser decimales)");
        } finally {
            scanner.close();
        }
    }
}
