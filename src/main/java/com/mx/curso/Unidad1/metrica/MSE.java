package com.mx.curso.Unidad1.metrica;

public class MSE extends Metrica{

    public MSE(int DatosPrueba) {
        super(DatosPrueba);
    }

    @Override
    public void calcularResultado(){
        System.out.println("Calculando MSE..." + DatosPrueba);
    }
}
