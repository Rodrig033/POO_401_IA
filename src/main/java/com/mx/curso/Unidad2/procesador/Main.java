package com.mx.curso.Unidad2.procesador;

import com.mx.curso.Unidad1.pipeline.FiltroImagen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String texto = "El modelo es excelente, es un modelo muy bueno y genial.";

        List<ProcesadorNLP> procesadores = new ArrayList<>();

        procesadores.add(new ProcesadorSimple());
        procesadores.add(new ProcesadorAnalisisSentimiento());

        for (ProcesadorNLP p: procesadores){
            System.out.println("\n=== Procesador" + p.getClass().getSimpleName() + " ===");
            p.cargarTexto(texto);
            p.limpiarTexto();
            List<String> tokens = p.tokenizar();
            Object resultado = p.transformarParaModelo();

            System.out.println("Tokens: " + tokens);
            System.out.println("Resultados: " + resultado);


        }
    }


}
