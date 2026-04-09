package com.mx.curso.Unidad2.practica_clase;

abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    };

    abstract double calcularArea();

    public void mostrarNombre(){
        System.out.println("La figura es " + nombre );
    }


}
