package com.mx.curso.Unidad1.agenteia;

public class RobotTerrestre extends AgenteIa{
    public RobotTerrestre(int Energia) {
        super(Energia);
    }

    @Override
    public void moverse() {
        super.moverse();
        System.out.println("Calculando las coordenadas en el plano 2D");
    }
}
