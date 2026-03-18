package com.mx.curso.Unidad1.procesador.audio;

public class ReductorDeEco extends ProcesadorDeAudio{
    @Override
    void filtrar() {
        super.filtrar();
        System.out.println("Reduciendo ruido del audio...");
    }
}
