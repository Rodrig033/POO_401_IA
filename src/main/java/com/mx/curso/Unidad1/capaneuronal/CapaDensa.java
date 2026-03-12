package com.mx.curso.Unidad1.capaneuronal;

public class CapaDensa extends  CapaNeuronal{

    private double[][] pesos;

    public CapaDensa(double[][] entrada, double[][] pesos) {
        super(entrada);
        this.pesos = pesos;
    }

    @Override
    void propagacionHaciaAdelante() {
        System.out.println("Aplicando transformación lineal hacia adelante (capa densa)...");
    }
}
