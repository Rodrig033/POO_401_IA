package com.mx.curso.Unidad1.clasificador;

public class SupportVectorMachine implements ClasificadorIA{
    @Override
    public String predecir(double[] datos) {
        System.out.println("Evaluando con SupportVectorMachine");
        return "Clase B";
    }
}
