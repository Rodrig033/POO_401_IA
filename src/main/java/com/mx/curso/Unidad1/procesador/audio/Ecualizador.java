package com.mx.curso.Unidad1.procesador.audio;

public class Ecualizador extends ProcesadorDeAudio{
    @Override
    void filtrar() {
        super.filtrar();
        System.out.println("Ajustando frecuencia de audio... ");
    }
}
