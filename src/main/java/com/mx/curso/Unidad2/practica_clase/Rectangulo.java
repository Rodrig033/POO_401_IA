package com.mx.curso.Unidad2.practica_clase;

public class Rectangulo extends FiguraGeometrica{
    double base;
    double altura;
    public Rectangulo(String nombre) {
        super(nombre);
    }

    @Override
    double calcularArea() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
        return area;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }

    public double getBase() {
        System.out.println("La base es " + base);
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        System.out.println("La altura es " + altura);
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}