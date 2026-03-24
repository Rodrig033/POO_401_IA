package com.mx.curso.Unidad2.actividad_refuerzo;

import java.util.ArrayList;
import java.util.List;

class SistemaOperativo {
    private List<Proceso> procesos;

    public SistemaOperativo(){
        procesos = new ArrayList<>();
    }

    public void agregarProceso(Proceso p){
        procesos.add(p);
    }

    public void ejecutarProcesos(){
        for (Proceso p: procesos){
            p.ejecutar();
        }
    }

}
