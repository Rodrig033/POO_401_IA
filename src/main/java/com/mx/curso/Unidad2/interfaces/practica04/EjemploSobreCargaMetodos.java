package com.mx.curso.Unidad2.interfaces.practica04;


class  DataSet{

}

public class EjemploSobreCargaMetodos {
    public void entrenar(DataSet [] dataSets){
        System.out.println("Método entrenar con 1 parámetro");
    }

    public void  entrenar(DataSet [] dataSets, int epoca){
        System.out.println("Método entrenar sobrecargado");
    }

}
