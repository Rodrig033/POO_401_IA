package com.mx.curso.Unidad1.clasificador;

import java.util.ArrayList;

public class SistemaIA {
    public static void main(String[] args) {
        ArrayList<ClasificadorIA> modelos = new ArrayList<>();

        modelos.add(new ArbolDeDecision());
        modelos.add(new SupportVectorMachine());
        modelos.add(new RedNeuronal());

        double[] datos = {5.2, 3.1, 1.8};

        for (ClasificadorIA modelo: modelos){
            String resultado = modelo.predecir(datos);
            System.out.println("Predicción: " + resultado);
            System.out.println();

        }
        }
    }

