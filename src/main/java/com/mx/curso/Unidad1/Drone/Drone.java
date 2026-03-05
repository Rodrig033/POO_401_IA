package com.mx.curso.Unidad1.Drone;

public class Drone {
    public int id;
    public int NivelBateria;

    // Constructor
    public Drone(int id, int NivelBateria) {
        this.id = id;
        this.NivelBateria = NivelBateria;
    }


    public static void main(String[] args) {

        Drone DroneOne = new Drone(1, 65);
        Drone DroneTwo = new Drone(2, 100);
        Drone DroneThree = new Drone(3, 75);

        System.out.println(DroneOne);
        System.out.println(DroneTwo);
        System.out.println(DroneThree);



    }

}

