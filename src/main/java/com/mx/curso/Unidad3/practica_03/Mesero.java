package com.mx.curso.Unidad3.practica_03;

public class Mesero extends Empleado{
    @Override
    public void trabajar() {
        System.out.println("Mi trabajo es hacer que el cliente se sienta cómodo y satisfecho.");
    }

    @Override
    public void saludar() {
        System.out.println("¡Bienvenid@ a The Bear! Mi nombre es Richard y seré su mesero el día de hoy.");
    }
}
