package com.mx.curso.Unidad1.abstraccion;

public class Main {
    public static void main(String[] args) {
        ModeloIA agente = new ReconocimientoFacial();
        agente.procesarEntrada("imagen_usuario.jpg");
    }
}
