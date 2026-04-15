package com.mx.curso.Unidad3.excepciones;

public class NullPointerException {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        NullPointerException cs = null;
        cs.setNumero(0);

        try {
            System.out.println(cs.getNumero());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
