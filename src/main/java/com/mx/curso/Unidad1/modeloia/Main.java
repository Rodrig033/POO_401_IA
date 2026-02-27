package com.mx.curso.Unidad1.modeloia;

public class Main {
    public static void main(String[] args) {
        // TODO: Instanciar un objeto de tipo AnalizadorSentimientos usando la referencia de la clase abstracta.
        // Ejemplo: MotorIA miModelo = new ...
        MotorIA motor = new AnalizadorSentimientos();


        System.out.println("Sistema de IA Iniciado...");

        // TODO: Llamar al método analizar con los siguientes textos:
        // 1. "Hoy es un día muy bueno y estoy feliz"
        // 2. "El servicio fue terrible"
        motor.analizar("Hoy es un día muy bueno y estoy feliz");
        motor.analizar("El servicio fue terrible");


        /* REFLEXIÓN PARA EL ALUMNO:
           ¿Puedes cambiar la precisión del modelo directamente con miModelo.precision = 5.0?
           No, la precisión debe de estar entre 0.0 y 1.0
           ¿Por qué es importante que el método analizar() oculte los pasos de tokenización?

        */
    }}