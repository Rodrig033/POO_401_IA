package com.mx.curso.Unidad2.practicas_poo.calculadora;

public class Calculadora {
    int a;
    int b;


    public int sumar(int a, int b){
        System.out.print("La suma de "+ a + " y " + b + " es: ");
       return a + b;
    }

    public int sumar(int a, int b, int c) {
        System.out.print("La suma de "+ a + ", " + b + " y "+ c +  " es: ");
        return a + b + c;
    }

    public double sumar(double a, double b){
        System.out.print("La suma de "+ a + " y " + b + " es: ");
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora casio = new Calculadora();
        System.out.println(casio.sumar(1, 2));
        System.out.println(casio.sumar(1, 2, 2));
        System.out.println(casio.sumar(1.5, 1.5));
    }
}