package com.mx.curso.Unidad2.practicas_poo;

public class Restaurante {
   String nombre;
   String tipoDeComida;
   int calificacion;

   Restaurante(String nombre, String tipoDeComida, int calificacion){

       this.nombre = nombre;
       this.tipoDeComida = tipoDeComida;
       this.calificacion = calificacion;
   }

   public void mostrarEstrellas(){
       for (int i = 0; i < calificacion; i++){
           System.out.print("*");
       }
       System.out.println();
   }

   public void abrir(){
       System.out.println("¡Bienvenido a " + nombre + "!");
       System.out.println("Ofrecemos " + tipoDeComida + " todos los días.");
       System.out.print("Calificación: ");
   }

    public static void main(String[] args) {
       Restaurante theBear = new Restaurante("The Bear", "Alta Cocina e Italian beefs", 5);
       Restaurante gusteaus = new Restaurante("Gusteau's", "Alta Cocina", 4);
       theBear.abrir();
       theBear.mostrarEstrellas();
       System.out.println("-------------------------------------");
       gusteaus.abrir();
       gusteaus.mostrarEstrellas();

    }
}
