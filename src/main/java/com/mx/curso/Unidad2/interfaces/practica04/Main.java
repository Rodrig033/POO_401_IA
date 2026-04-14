package com.mx.curso.Unidad2.interfaces.practica04;

public class Main {
    public static void main(String[] args) {
        EjemploSobreCargaMetodos carga = new EjemploSobreCargaMetodos();

        DataSet[] dataSets = new DataSet[5];
        int epoca = 1;

        carga.entrenar(dataSets, epoca);
        carga.entrenar(dataSets);
    }
}
