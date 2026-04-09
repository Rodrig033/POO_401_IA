package com.mx.curso.Unidad2.actividades_indp.zoologico;

public class Animal {
    private String sonido;

    Animal(String sonido){
        this.sonido = sonido;
    }

    public void hacerSonido(){
        System.out.println(sonido);
    }

    public String getSonido() {
        System.out.println(sonido);
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
        System.out.println(sonido);
    }

}
