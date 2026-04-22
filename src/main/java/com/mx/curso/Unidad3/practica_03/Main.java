package com.mx.curso.Unidad3.practica_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        Mesero richard = new Mesero();
        Cocinero gordon = new Cocinero();
        empleados.add(richard);
        empleados.add(gordon);

        for (Empleado empleado: empleados){
            empleado.saludar();
            empleado.trabajar();
        }
    }
}
