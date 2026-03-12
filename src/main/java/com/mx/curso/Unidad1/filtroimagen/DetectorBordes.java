package com.mx.curso.Unidad1.filtroimagen;

public class DetectorBordes extends FiltroImagen{

    public DetectorBordes(int[][] imagen) {
        super(imagen);
    }

    @Override
    void aplicar(){
        System.out.println("Aplicando Kernel de detección de bordes... ");
    }
}