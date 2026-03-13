package com.mx.curso.Unidad1.procesador.audio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProcesadorDeAudio> procesadores = new ArrayList<>();
        procesadores.add(new ReductorDeEco());
        procesadores.add(new Ecualizador());
        procesadores.add(new Normalizador());

        for (ProcesadorDeAudio f: procesadores ) {
            f.filtrar();
        }
    }
}
