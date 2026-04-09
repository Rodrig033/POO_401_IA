package com.mx.curso.Unidad2.practicas;

public class Restaurante {
   String nombre;
   String tipoDeComida;
   int calificacion;

   public void abrir(){
       System.out.println("!Bienvenido a " + nombre + " ¡");
       System.out.println("Ofrecemos " + tipoDeComida + " todos los días.");
       System.out.println("Nuestra calificación es de " + calificacion + " estrellas.");
   }

    public static void main(String[] args) {
        Restaurante thebear;
    }
}
