package com.mx.curso.Unidad2.actividades_indp.vuelo;

public class Avion implements PuedeVolar{
    @Override
    public void volar() {
        System.out.println("El avión enciende sus motores.");
    }
}
