package com.mx.curso.Unidad3.practica_03;

public class Cocinero extends Empleado{
    @Override
    public void trabajar() {
        System.out.println("Mi trabajo es preparar los alimentos más exquisitos para el paladar.");
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy el chef Gordon Ramsay.");
    }

}
