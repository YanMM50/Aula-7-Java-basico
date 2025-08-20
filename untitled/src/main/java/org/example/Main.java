package org.example;


public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria", 25);
        Cliente cliente2 = new Cliente("Yan", 24);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}