package com.mx.curso.Unidad3.genericos;

import java.util.List;

public interface Modelo {
    // Los métodos ya son abstractos
    void activar(List<String> activaciones);
}

class ImplementaModelo implements Modelo{

    @Override
    public void activar(List<String> activaciones) {

    }
}