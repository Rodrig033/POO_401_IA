package com.mx.curso.Unidad2.practicas_poo.practica_clase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        Circulo ciruclo1 = new Circulo("Círculo");
        ciruclo1.setRadio(12);
        figuras.add(ciruclo1);


        Rectangulo rectangulo1 = new Rectangulo("Rectángulo");
        rectangulo1.setBase(20);
        rectangulo1.setAltura(25);
        figuras.add(rectangulo1);

        // Instanceof: Me permite comparar las clases (mucho más limpio que ==).

        for (FiguraGeometrica figura: figuras){
            figura.mostrarNombre();

                if (figura instanceof Circulo){
                ciruclo1.getRadio();
            } else if (figura instanceof Rectangulo) {
                rectangulo1.getBase();
                rectangulo1.getAltura();
            }
            figura.calcularArea();

        }
    }
}
