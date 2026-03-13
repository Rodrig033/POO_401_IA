package com.mx.curso.Unidad1.agente.inteligente;

import java.util.ArrayList;

public class AgenteInteligente {
    void tomarDecision() {

    }

    public static void main(String[] args) {
        AgenteInteligente [] agentes = {
                new Explorador(),
                new Recolector(),
                new Defensor()
        };

        for (AgenteInteligente p: agentes){
            p.tomarDecision();
        }

    }
}
