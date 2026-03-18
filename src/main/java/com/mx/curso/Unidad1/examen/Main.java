package com.mx.curso.Unidad1.examen;

public class Main {
    public static void main(String[] args) {
        MetodoDePago [] pagos = {
                new PagoConTarjeta(1500),
                new PagoConPaypal(100000),
                new PagoConEfectivo(50)
        };

        for (MetodoDePago i: pagos){
            i.procesarPago();
        }
    }
}
