package com.mx.curso.Unidad1.agente.inteligente;

public class Explorador extends AgenteInteligente{
    @Override
    public void tomarDecision() {
        System.out.println("Explorando el entorno...");
        System.out.println("Exploración terminada.");
        super.tomarDecision();
    }
}
