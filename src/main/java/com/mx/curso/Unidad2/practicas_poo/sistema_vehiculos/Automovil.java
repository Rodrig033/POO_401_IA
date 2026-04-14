package com.mx.curso.Unidad2.practicas_poo.sistema_vehiculos;

public class Automovil extends Vehiculo{
    Automovil(int velocidad, int numLlantas) {
        super(velocidad, numLlantas);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        for (int i = 0; i <= velocidad; i += 10){
            System.out.println("El automóvil va a " + i + " por hora.");
        }
    }

}
