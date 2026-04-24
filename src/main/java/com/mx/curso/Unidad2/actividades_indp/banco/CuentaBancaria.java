package com.mx.curso.Unidad2.actividades_indp.banco;

public class CuentaBancaria {
    private double saldo;

    CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void retirar(double monto){
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Usted ha retirado $" + monto + ".");
            System.out.println("Saldo actual: " + saldo);
        }else {
            System.out.println("Saldo insuficiente...");
        }
    }

    public void depositar(double monto){
        saldo += monto;
        System.out.println("Usted ha depositado $" + monto + ".");
        System.out.println("Saldo actual: " + saldo);
    }

    public double getSaldo() {
        System.out.println("Su saldo es de $" + saldo + ".");
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("Se ha modificado su saldo: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria rodrigo = new CuentaBancaria(1000);
        rodrigo.getSaldo();
        rodrigo.depositar(200);
        rodrigo.retirar(200);
        rodrigo.setSaldo(5000);
    }

}
