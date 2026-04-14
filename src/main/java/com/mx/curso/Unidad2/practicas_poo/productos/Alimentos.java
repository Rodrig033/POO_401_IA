package com.mx.curso.Unidad2.practicas_poo.productos;

public class Alimentos extends Productos{
    String fechaDeCaducidad;

    Alimentos(String nombre, double precio, String fechaDeCaducidad) {
        super(nombre, precio);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("La fecha de caducidad: " + fechaDeCaducidad);
    }
}
