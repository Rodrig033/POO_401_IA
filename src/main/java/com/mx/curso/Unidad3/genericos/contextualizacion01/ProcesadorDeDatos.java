package com.mx.curso.Unidad3.genericos.contextualizacion01;

import java.util.List;
import java.util.Map;

public interface ProcesadorDeDatos <T, V, K>{
    void ProcesarSecuencia(List<T> elementos);
    void procesarMapa(Map<K, V> datosAsociativos);
}

class ProcesadorVision implements  ProcesadorDeDatos<String, String, String>{

    @Override
    public void ProcesarSecuencia(List<String> elementos) {

    }

    @Override
    public void procesarMapa(Map<String, String> datosAsociativos) {

    }
}

class MotorRecomendaciones implements ProcesadorDeDatos<Integer, String, Double>{

    @Override
    public void ProcesarSecuencia(List<Integer> elementos) {

    }

    @Override
    public void procesarMapa(Map<Double, String> datosAsociativos) {

    }
}

class ProcesadorPesos implements ProcesadorDeDatos<Double, Double, String>{

    @Override
    public void ProcesarSecuencia(List<Double> elementos) {

    }

    @Override
    public void procesarMapa(Map<String, Double> datosAsociativos) {

    }
}

