package com.mx.curso.Unidad1.funciones.vehiculo;

public class AplicacionDeMetodo extends FuncionesVehiculo{
    @Override
    public String frenar() {
        return "El vehículo ha frenado.";
    }

    @Override
    public String acelerar() {
        return "El vehículo a acelerado (Conduzca con cuidado).";
    }

    public static void main(String[] args) {
        AplicacionDeMetodo frenar = new AplicacionDeMetodo();
        AplicacionDeMetodo acelerar = new AplicacionDeMetodo();
        System.out.println(frenar.frenar());
        System.out.println(acelerar.acelerar());
    }
}
