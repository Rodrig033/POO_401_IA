package com.mx.curso.Unidad2.practicas_poo.productos;

public class Productos {
    String nombre;
    double precio;

    Productos(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles(){
        System.out.println("El producto es " + nombre);
        System.out.println("El precio es " + precio);
    };
}
