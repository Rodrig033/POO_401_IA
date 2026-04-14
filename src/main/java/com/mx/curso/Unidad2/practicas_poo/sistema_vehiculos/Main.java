package com.mx.curso.Unidad2.practicas_poo.sistema_vehiculos;

public class Main {
    public static void main(String[] args) {
        Automovil ferrari = new Automovil(300, 30);
        Bicicleta mercurio = new Bicicleta(268, 22);

        ferrari.acelerar();
        System.out.println("-------------------------------");
        mercurio.acelerar();
    }
}
