package com.mx.curso.Unidad1.practica_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SensorIA> percepcionHub = new ArrayList<>();

        SensorLidar objeto1 = new SensorLidar();
        SensorLidar objeto2 = new SensorLidar();

        SensorVision objeto3 = new SensorVision();
        SensorVision objeto4 = new SensorVision();

        SensorUltrasonido objeto5 = new SensorUltrasonido();
        SensorUltrasonido objeto6 = new SensorUltrasonido();


        percepcionHub.add(objeto1);
        percepcionHub.add(objeto2);
        percepcionHub.add(objeto3);
        percepcionHub.add(objeto4);
        percepcionHub.add(objeto5);
        percepcionHub.add(objeto6);


        for (SensorIA sensor: percepcionHub){
            sensor.leerDatos();
        }
    }
}


