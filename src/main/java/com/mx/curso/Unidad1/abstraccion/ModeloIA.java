package com.mx.curso.Unidad1.abstraccion;

public abstract class ModeloIA {
    protected String nombre;

    // Constructor de la clase
    public ModeloIA(String nombre){
        this.nombre = nombre;
    }

    public abstract void procesarEntrada(String entrada);


}
