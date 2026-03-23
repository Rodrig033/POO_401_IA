package com.mx.curso.Unidad2.procesador;

import java.util.List;

public abstract class ProcesadorNLP {
    protected String textoCrudo;
    public void cargarTexto(String texto){
        this.textoCrudo = texto;

    }

    public abstract List<String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarParaModelo();
}
