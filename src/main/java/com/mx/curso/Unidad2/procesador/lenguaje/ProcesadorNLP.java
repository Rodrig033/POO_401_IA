package com.mx.curso.Unidad2.procesador.lenguaje;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcesadorNLP {
    private String textoCrudo;
    protected List<String> tokens = new ArrayList<>();
    public void cargarTexto(){};
    public abstract List <String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarModelo();

    public String getTextoCrudo() {
        return textoCrudo;
    }

    public void setTextoCrudo(String textoCrudo) {
        this.textoCrudo = textoCrudo;
    }
}
