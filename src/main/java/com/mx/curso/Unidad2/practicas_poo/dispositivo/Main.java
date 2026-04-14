package com.mx.curso.Unidad2.practicas_poo.dispositivo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Encendible> dispositivos = new ArrayList<>();
        TV samsung = new TV();
        Bombilla philips = new Bombilla();
        dispositivos.add(samsung);
        dispositivos.add(philips);

        for (Encendible dispositivo: dispositivos){
            dispositivo.encender();
            dispositivo.apagar();
        }
    }
}
