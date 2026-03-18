package com.mx.curso.Unidad1.agente.inteligente;

public class Defensor extends AgenteInteligente{
    @Override
    public void tomarDecision() {
        System.out.println("El agente ha evitado un posible ataque.");
        super.tomarDecision();
    }
}
