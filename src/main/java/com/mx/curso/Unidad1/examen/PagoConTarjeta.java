package com.mx.curso.Unidad1.examen;

public class PagoConTarjeta extends MetodoDePago{
    public PagoConTarjeta(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pagando $" + monto + " con tarjeta.");
    }
}
