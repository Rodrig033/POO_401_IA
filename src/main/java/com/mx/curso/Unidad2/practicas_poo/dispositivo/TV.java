package com.mx.curso.Unidad2.practicas_poo.dispositivo;

public class TV implements Encendible{
    @Override
    public void encender() {
        System.out.println("La televisión se ha encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Cerrando las aplicaciones... ");
    }
}
