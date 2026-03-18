package com.mx.curso.Unidad1.ciclos;

public class RecetaDeCocina {
    public static void main(String[] args) {
        int ingredientesPreparados = 5;
        int tiempoDeCocina = 90;
        int ingredienteUsado = 0;
        int tiempoTranscurrido = 0;

        if (ingredienteUsado == 0){
            System.out.println("Paso 1: Prepara los ingredientes");
        }
        while (ingredienteUsado <= ingredientesPreparados){
            ingredienteUsado ++;
            if (ingredienteUsado == ingredientesPreparados){
                System.out.println("Ingredientes Preparados: " + ingredientesPreparados);
            }
        }

        if (tiempoTranscurrido == 0){
            System.out.println("Paso 2: Cocina el platillo");
        }
        while (tiempoTranscurrido <= tiempoDeCocina){
            tiempoTranscurrido ++;
            if (tiempoTranscurrido == tiempoDeCocina){
                System.out.println("Tiempo transcurrido: " + tiempoDeCocina);
                System.out.println("El platillo está listo.");
            }
        }
    }
}
