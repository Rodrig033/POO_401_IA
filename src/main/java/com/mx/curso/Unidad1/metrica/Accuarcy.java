package com.mx.curso.Unidad1.metrica;

public class Accuarcy extends Metrica {

    public Accuarcy(int DatosPrueba) {
        super(DatosPrueba);
    }

    @Override
    public void calcularResultado(){
        System.out.println("Calculando Accuracy...");
    }
}

