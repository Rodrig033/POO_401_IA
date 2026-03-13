package com.mx.curso.Unidad1.procesador.audio;

public class Normalizador extends ProcesadorDeAudio{
    @Override
    void filtrar() {
        super.filtrar();
        System.out.println("Normalizando volumen del audio...");
    }
}
