package com.mx.curso.Unidad1.abstraccion;

public class ReconocimientoFacial extends ModeloIA {


    public ReconocimientoFacial() {
        super("Visión 1.0");
    }

    @Override
    public void procesarEntrada(String entrada) {
        System.out.println("Cargando datos...");
        System.out.println("Extrayenfo datos...");
        System.out.println("Comparando Vector...");
    }
}
