package com.mx.curso.Unidad2.practica_clase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo("Circulo"));
        figuras.add(new Circulo("Rectangulo"));

        for (FiguraGeometrica figura: figuras){
            figura.mostrarNombre();
            figura.calcularArea();
        }
    }
}
