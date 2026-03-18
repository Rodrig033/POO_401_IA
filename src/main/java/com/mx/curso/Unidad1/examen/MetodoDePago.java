package com.mx.curso.Unidad1.examen;

abstract class MetodoDePago {
    protected double monto;

    public MetodoDePago(double monto){
        this.monto = monto;
    }

    public abstract void procesarPago();

}
