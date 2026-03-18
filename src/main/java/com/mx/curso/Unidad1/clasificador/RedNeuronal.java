package com.mx.curso.Unidad1.clasificador;

public class RedNeuronal implements ClasificadorIA{
    @Override
    public String predecir(double[] datos) {
        System.out.println("Evaluando con red neuronal...");
        return "Clase C";
    }
}
