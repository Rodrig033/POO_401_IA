package com.mx.curso.Unidad2.manejo_ciclos;

public class ManejoDeCiclos {

    public static void main(String[] args) {
        System.out.println("---- Conteo ascendente ----");
        int numero = 0;
        while (numero < 5){
            numero ++;
            System.out.println(numero);
        }

        System.out.println("---- Conteo descendente ----");
        int corto = 11;
        do {
            corto--;
            System.out.println(corto);
        }while (corto > 8);

        System.out.println("---- Tabla de multiplicar del 7 ----");
        int base = 7;
        for (int i = 1; i < 11; i++){
            System.out.println( "7 X " + i + " = " + base * i);
        }
    }
}
