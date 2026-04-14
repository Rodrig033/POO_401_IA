package com.mx.curso.Unidad2.practicas_poo.estudiantes;

public class Estudiante {
    private String nombre;
    private int id;

    Estudiante(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }


}
