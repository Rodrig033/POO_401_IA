package com.mx.curso.Unidad1.modeloia;
/**
 * PRACTICA: ABSTRACCIÓN Y ENCAPSULAMIENTO EN IA
 * Alumno: Rodrigo Farid López Córdoba
 * Materia: POO - Ingeniería en IA
 */

// 1. LA ABSTRACCIÓN: El contrato general
abstract class MotorIA {
    // Atributos encapsulados (Protegidos de acceso externo indebido)
    private String nombreModelo;
    private double precision;

    public MotorIA(String nombre, double precision) {
        this.nombreModelo = nombre;
        this.precision = precision;
    }

    // GETTERS Y SETTERS (Encapsulamiento)
    public String getNombre() { return nombreModelo; }

    public abstract void analizar(String texto);

    // TODO: Implementar el setter para precision con una validación:
    // La precisión no puede ser menor a 0.0 ni mayor a 1.0.
    public void setPrecision(double precision){
        if (precision >= 0.0 && precision <= 1.0){
            this.precision = precision;
        }else {
            System.out.println("Error: La precisión debe de estar entre 0.0 y 1.0");
        }
    }


    // EL QUÉ: Contrato abstracto
    // TODO: Define un método abstracto llamado 'analizar' que reciba un String.
    // Ya está definido más arriba
}

