package com.mx.curso.Unidad2.practicas_poo.estudiantes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clase poo = new Clase("Programación orientada a objetos");
        Estudiante rodrigo = new Estudiante("Rodrigo", 001);
        Estudiante elonMusk = new Estudiante("Elon Musk", 014);
        Estudiante markZucerberg = new Estudiante("Mark Zuckerberg", 021);
        Estudiante alanTuring = new Estudiante("Alan Turing", 031);


        poo.agregarEstudiante(rodrigo);
        poo.agregarEstudiante(elonMusk);
        poo.agregarEstudiante(markZucerberg);
        poo.agregarEstudiante(alanTuring);

        poo.mostrarEstudiantes();
    }
}
