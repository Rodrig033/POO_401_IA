package com.mx.curso.Unidad1.capaneuronal;

abstract class CapaNeuronal {
    double  [][] entrada;
    double  [][] salida;

    public CapaNeuronal(double [][] entrada){
        this.entrada = entrada;
    }

    abstract void propagacionHaciaAdelante();
}
