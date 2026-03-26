package com.mx.curso.Unidad2.interfaces;

// Las interfaces por default, los métodos son abstractos:
interface Serializable{
    public void a();
}

interface  Tokenizable{
    public void b();
}

public interface Entrenable {
    public void c();
}

class modelo implements Serializable, Tokenizable, Entrenable {

    @Override
    public void c() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

}