package com.mx.curso.Unidad2.practicas_poo.sistema_vehiculos;

public class Bicicleta extends Vehiculo{
    Bicicleta(int velocidad, int numLlantas) {
        super(velocidad, numLlantas);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        for (int i = 0; i <= velocidad; i += 5){
            System.out.println("La bicicleta va a " + i + " por hora.");
        }
    }

}
