package com.mx.curso.Unidad1.examen;

public class PagoConEfectivo extends MetodoDePago{
    public PagoConEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pagando $" + monto + " con efectivo");
    }
}
