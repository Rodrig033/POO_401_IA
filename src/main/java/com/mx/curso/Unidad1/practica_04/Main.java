package com.mx.curso.Unidad1.practica_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SensorIA> percepcionHub = new ArrayList<>();

        SensorLidar objeto1 = new SensorLidar("1.1", 1.30);
        SensorLidar objeto2 = new SensorLidar("1.4", 2.65);

        SensorVision objeto3 = new SensorVision("1.23", 2.04);
        SensorVision objeto4 = new SensorVision("1.33", 3.05);

        SensorUltrasonido objeto5 = new SensorUltrasonido("2.50", 4.4);
        SensorUltrasonido objeto6 = new SensorUltrasonido("3.2", 1.2);



        percepcionHub.add(objeto1);
        percepcionHub.add(objeto2);
        percepcionHub.add(objeto3);
        percepcionHub.add(objeto4);
        percepcionHub.add(objeto5);
        percepcionHub.add(objeto6);
        objeto1 = new  SensorLidar("1.2", 1.40);
        percepcionHub.add(objeto1);
        objeto2 = new SensorLidar("2.4", 2.67);
        objeto2.setModelo("2.5");
        percepcionHub.add(objeto2);



        for (SensorIA sensor: percepcionHub){
            sensor.leerDatos();
        }
    }
}


