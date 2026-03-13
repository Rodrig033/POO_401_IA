package com.mx.curso.Unidad1.clasificador;

public class ArbolDeDecision implements ClasificadorIA {
    @Override
    public String predecir(double[] datos) {
        System.out.println("Evaluando con árbol de decisión...");
        return "Clase A";
    }
}
