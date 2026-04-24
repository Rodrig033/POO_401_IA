package com.mx.curso.Unidad3.excepciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploArraysIndex {

    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();

        try {

            listaEnteros.add(1);
            listaEnteros.add(3);
            listaEnteros.add(4);
            System.out.println(listaEnteros.get(5));

        } catch (Exception e) {
            System.out.println("Nombre de la clase:" + " " + e.getMessage());
            System.out.println("Exception:" + " " + e.getStackTrace());
            System.out.println("Causa" + " " + e.getCause());
            System.out.println("Método" + " " + "Main");
        }
    }
}
