package com.mx.curso.Unidad2.practicas_poo.productos;

public class Electronica extends Productos{
    String garantia;

    Electronica(String nombre, double precio, String garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("La garantía es " + garantia);
    }
}
