package com.mx.curso.Unidad1.agenteia;

public class DronExplorador extends AgenteIa{

    public DronExplorador(int Energia) {
        // Constructor de la clase padre (AgenteIA)
        super(Energia);
    }

    @Override
    public void moverse() {
        super.moverse();
        System.out.println("Calculado las coordenadas en el plano 3D");
    }


}
