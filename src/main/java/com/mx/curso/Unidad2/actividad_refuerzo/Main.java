package com.mx.curso.Unidad2.actividad_refuerzo;

public class Main {
    public static void main(String[] args) {
        SistemaOperativo so = new SistemaOperativo();

        Proceso ps = new ProcesoSistema(1,"Kernel");
        Proceso pu = new ProcesoSistema(2, "Chrome");

        so.agregarProceso(ps);
        so.agregarProceso(pu);

        so.ejecutarProcesos();
    }
}
