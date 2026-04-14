package com.mx.curso.Unidad2.practicas_poo.dispositivo;

public class Bombilla implements Encendible{
    @Override
    public void encender() {
        System.out.println("On");
    }

    @Override
    public void apagar() {
        System.out.println("Off");
    }
}
