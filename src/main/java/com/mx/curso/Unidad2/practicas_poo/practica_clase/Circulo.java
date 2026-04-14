package com.mx.curso.Unidad2.practicas_poo.practica_clase;

public class Circulo extends FiguraGeometrica{

    double radio;


    public Circulo(String nombre) {
        super(nombre);
    }

    @Override
    double calcularArea() {
       double pi = 3.1416;
       double area = (pi * Math.pow(radio, 2));
       System.out.println("El área del circulo es: " + area);
       return area;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }

    public double getRadio() {
        System.out.println("El radio del círculo es: " + radio + " cm");
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
