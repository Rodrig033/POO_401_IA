package com.mx.curso.Unidad2.procesador;

import java.util.*;

public class ProcesadorAnalisisSentimiento extends ProcesadorNLP{
    private List<String> tokens = new ArrayList<>();
    private Set<String> stopWords = new HashSet<>(Arrays.asList(
            "el", "la", "los", "las", "un", "una", "y", "de"
    ));
    private Set<String> palabrasPositivas = new HashSet<>(Arrays.asList(
            "bueno", "excelente", "feliz", "genial", "increible"
    ));

    @Override
    public List<String> tokenizar() {
        tokens = Arrays.asList(textoCrudo.toLowerCase().split("\\s+"));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        List<String> filtradas = new ArrayList<>();
        for (String palabra:tokens) {
            palabra = palabra.replace(".", "").replace(",", "");
            if (!stopWords.contains(palabra)) {
                filtradas.add(palabra);
            }
        }
        tokens = filtradas;
    }

    @Override
    public Object transformarParaModelo() {
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra: tokens) {
            if (palabrasPositivas.contains(palabra)) {
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
        }
        return frecuencia;
    }
}

