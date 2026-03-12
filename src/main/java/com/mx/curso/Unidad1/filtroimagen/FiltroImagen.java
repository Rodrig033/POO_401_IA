package com.mx.curso.Unidad1.filtroimagen;

abstract class FiltroImagen {
   protected int [][] imagen;


    public FiltroImagen(int [][] imagen){
        this.imagen = imagen;
    }

    abstract void aplicar();

}
