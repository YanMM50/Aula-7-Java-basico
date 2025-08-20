package org.example.livro;

public class Livros {
    private String titulo;
    private String autor;
    private int isbn;
    private int numeropagina;
    private double valorlivro;

    public Livros(String titulo, String autor, int isbn, int numeropagina, double valorlivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeropagina = numeropagina;
        this.valorlivro = valorlivro;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                ", numeropagina=" + numeropagina +
                ", valorlivro=" + valorlivro +
                '}';
    }
}
