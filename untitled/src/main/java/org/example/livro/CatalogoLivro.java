package org.example.livro;

public class CatalogoLivro {
    public static void main(String[] args) {
        Livros livro1 = new Livros("Crepusculo", "Stephanie Mayer", 9999, 416,35);

        System.out.println("Dados do 1º livro: " + livro1.toString());

}
}
