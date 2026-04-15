package com.mx.curso.Unidad3.listas;

import java.util.ArrayList;
import java.util.List;

public class MetricaEntrenamiento {

    int epoca;
    double loss;
    double accuracy;


    public MetricaEntrenamiento(int epoca, double loss, double accuracy) {
        this.epoca = epoca;
        this.loss = loss;
        this.accuracy = accuracy;
    }


    @Override
    public String toString() {
        return "MetricasEntrenamiento{" +
                "accuracy=" + accuracy +
                ", epoca=" + epoca +
                ", loss=" + loss +
                '}';
    }


    public static void main(String[] args) {

        List<MetricaEntrenamiento> metricas = new ArrayList<>();
        MetricaEntrenamiento metrica1 = new MetricaEntrenamiento(10, 0.13, 0.20);
        MetricaEntrenamiento metrica2 = new MetricaEntrenamiento(5, 0.20, 0.40);
        MetricaEntrenamiento metrica3 = new MetricaEntrenamiento(7, 0.70, 0.10);
        MetricaEntrenamiento metrica4 = new MetricaEntrenamiento(4, 0.15, 0.30);
        metricas.add(metrica1);
        metricas.add(metrica2);
        metricas.add(metrica3);
        metricas.add(metrica4);

        // Imprimir la lista de métricas
        System.out.println("---- Lista de métricas ----");
        for (MetricaEntrenamiento metric : metricas) {
            System.out.println(metric);
        }

        // Imprimir el primer y el último elemento
        System.out.println("---- 1er y último elemento ----");
        System.out.println("Primer elemento: " + metricas.get(0));
        System.out.println("Último elemento: " + metricas.get(metricas.size() - 1));

        // Eliminar el primer y último elemento
        metricas.remove(0);
        metricas.remove((metricas.size() - 1));

        System.out.println("---- Lista de métricas actualizada ----");
        // Iterar la lista de métricas y detectar el orden de inserción
        for (MetricaEntrenamiento metric : metricas) {
            System.out.println(metric);
        }
    }
}
