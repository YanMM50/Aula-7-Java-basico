package org.example.pet;

public class Animais {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentacao;

    public Animais(String nome, int idade, String raca, String porte, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                ", porte='" + porte + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }
}
