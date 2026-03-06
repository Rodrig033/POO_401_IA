package com.mx.curso.Unidad1.capaneuronal;

public class CapaConvolucional extends CapaNeuronal{
    private double[][] kernel;

    public CapaConvolucional(double[][] entrada, double[][]kernel) {
        super(entrada);
        this.kernel = kernel;
    }

    @Override
    void propagacionHaciaAdelante() {
        System.out.println("Aplicando operación de convolución...");
    }
}
