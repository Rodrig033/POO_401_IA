package com.mx.curso.Unidad2.actividades_indp.libros;

public class Libros {
    String titulo;
    String autor;
    int paginas;

    public Libros (String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Libros libro1 = new Libros("Cien años de soledad", "Gabriel García Márquez", 560);
        Libros libro2 = new Libros("La divina comedia", "Dante Alighieri", 800);

        libro1.mostrarInfo();
        libro2.mostrarInfo();

    }

}
