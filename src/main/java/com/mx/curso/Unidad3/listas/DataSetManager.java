package com.mx.curso.Unidad3.listas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSetManager {
    public static void main(String[] args) {
        List<String> dataset = new ArrayList<>();
        dataset.add("gato_01.jpg");
        dataset.add("gato_02.jpg");
        dataset.add("gato_03.jpg");
        dataset.add("gato_04.jpg");

        System.out.println("Dataset original" + " ");

        // Creación de sublista
        List<String> sublista = dataset.subList(0, 3);
        System.out.println("Sublista: " + sublista);

        // Para reemplazar un elemento en específico
        dataset.set(0, dataset.get(0).replace(".jpg", ".tmp"));
        System.out.println("Dataset " + dataset);

        // Método clear
        System.out.println("Último elemento: " + dataset.get(0));
        dataset.clear();
        System.out.println("Tamaño actual de la lista: " + dataset.size());
    }

}
