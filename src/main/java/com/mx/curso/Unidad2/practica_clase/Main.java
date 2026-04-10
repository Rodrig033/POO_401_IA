package com.mx.curso.Unidad2.practica_clase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        Circulo ciruclo1 = new Circulo("Círculo");
        ciruclo1.setRadio(12);
        figuras.add(ciruclo1);

        Circulo circulo2 = new Circulo("Circulo pequeño");
        circulo2.setRadio(5);
        figuras.add(circulo2);

        Rectangulo rectangulo1 = new Rectangulo("Rectángulo");
        rectangulo1.setBase(20);
        rectangulo1.setAltura(25);
        figuras.add(rectangulo1);

        for (FiguraGeometrica figura: figuras){
            figura.mostrarNombre();

                if (figura == ciruclo1){
                ciruclo1.getRadio();
            } else if (figura == rectangulo1) {
                rectangulo1.getBase();
                rectangulo1.getAltura();
            }
            figura.calcularArea();

        }
    }
}
