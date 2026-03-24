package com.mx.curso.Unidad2.actividad_refuerzo;

abstract class Proceso {
    protected int id;
    protected String nombre;

    public Proceso(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public abstract void ejecutar();
}
