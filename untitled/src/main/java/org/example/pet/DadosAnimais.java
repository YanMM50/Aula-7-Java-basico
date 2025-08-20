package org.example.pet;

public class DadosAnimais {
    public static void main(String[] args) {
        Animais animal1 = new Animais("Luck", 5, "Pincher", "Pequeno", "Ração");
        Animais animal2 = new Animais("Florzinha", 9, "Pitbull", "Grande", "Humanos");

        System.out.println("Dados animal 1: " + animal1.toString());
        System.out.println("Dados animal 2: " + animal2.toString());
    }
}
