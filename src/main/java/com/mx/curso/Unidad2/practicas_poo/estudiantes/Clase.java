package com.mx.curso.Unidad2.practicas_poo.estudiantes;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    private String nombreDeClase;
    private List<Estudiante> estudiantes;

    public Clase(String nombreDeClase){
        this.nombreDeClase = nombreDeClase;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        System.out.println("Clase: " + nombreDeClase);

        for (Estudiante e : estudiantes) {
            System.out.println("Estudiante: " + e.getNombre());
            System.out.println("Matrícula: " + e.getId());

        }
    }

}
