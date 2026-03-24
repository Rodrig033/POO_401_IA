package com.mx.curso.Unidad2.actividad_refuerzo;

class ProcesoSistema extends Proceso{

    public ProcesoSistema(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando el proceso del sistema: " + nombre);
    }
}
