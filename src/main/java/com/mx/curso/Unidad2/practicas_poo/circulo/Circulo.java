package com.mx.curso.Unidad2.practicas_poo.circulo;

public class Circulo {
    private double radio;
    double pi = 3.1416;


    Circulo(float radio){
        this.radio = radio;
    }

    double calcularArea(){
        double area = (pi * Math.pow(radio, 2));
        System.out.println("El área del circulo es: " + area);
        return area;
    }

    double calcularCircunferencia(){
        double circunferencia = 2 * pi * radio;
        System.out.println("La circunferencia es: " + circunferencia);
        return circunferencia;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        circulo.calcularCircunferencia();
    }
}
