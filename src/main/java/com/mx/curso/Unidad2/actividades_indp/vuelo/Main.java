package com.mx.curso.Unidad2.actividades_indp.vuelo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PuedeVolar> voladores = new ArrayList<>();

        Avion concorde = new Avion();
        Pajaro colibri = new Pajaro();

        voladores.add(concorde);
        voladores.add(colibri);

        for (PuedeVolar volador: voladores){
            volador.volar();
        }
    }
}
