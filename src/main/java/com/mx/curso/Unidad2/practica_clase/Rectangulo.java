package com.mx.curso.Unidad2.practica_clase;

public class Rectangulo extends FiguraGeometrica{
    double base;
    double altura;
    public Rectangulo(String nombre) {
        super(nombre);
    }

    @Override
    double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }

}
