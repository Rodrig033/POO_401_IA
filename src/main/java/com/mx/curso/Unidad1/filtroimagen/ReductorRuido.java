package com.mx.curso.Unidad1.filtroimagen;

public class ReductorRuido extends FiltroImagen{
    public ReductorRuido(int[][] imagen) {
        super(imagen);
    }

    @Override
    void aplicar() {
        System.out.println("Aplicandon filtro de suavizado");
    }
}
