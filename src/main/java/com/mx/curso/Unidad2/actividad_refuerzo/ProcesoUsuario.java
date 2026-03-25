package com.mx.curso.Unidad2.actividad_refuerzo;

class ProcesoUsuario extends Proceso {

    public ProcesoUsuario(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando el proceso del usuario: " + nombre);
    }
}
