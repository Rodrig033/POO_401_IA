package com.mx.curso.Unidad1.examen;

public class PagoConPaypal extends MetodoDePago{
    public PagoConPaypal(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pagando $" + monto + " con Paypal");
    }
}
