package com.mx.curso.Unidad3.datos_producto;
import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String estadoPedido = " ";

        while (!estadoPedido.equals("Entregado")){
            System.out.print("Ingrese el estado del pedido: " );
            estadoPedido = scanner.nextLine();
            if (estadoPedido.equals("En camino")){
                continue;
            } else if (estadoPedido.equals("Error en envío")) {
                System.out.println("Verificaremos tu pedido...");
                break;
            } else if (estadoPedido.equals("Entregado")) {
                System.out.println("¡El pedido ha sido entregado con éxito!");
            }
        }
        System.out.println("Fin del seguimiento del pedido");
        scanner.close();
    }
}
