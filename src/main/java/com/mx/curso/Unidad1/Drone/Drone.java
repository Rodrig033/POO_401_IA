package com.mx.curso.Unidad1.Drone;

public class Drone {
    private int ID;
    private int NivelBateria;

    // Constructor
    public Drone(int id, int nivelBateria) {
        ID = id;
        NivelBateria = nivelBateria;
    }

    Drone DroneOne = new Drone(1, 65);
    Drone DroneTwo = new Drone(2, 100);
    Drone DroneThree = new Drone(3, 75);


}
