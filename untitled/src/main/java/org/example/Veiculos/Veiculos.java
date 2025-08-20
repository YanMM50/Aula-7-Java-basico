package org.example.Veiculos;

public class Veiculos {
    private String placa;
    private String cor;
    private int numpassageiros;
    private String capacitanque;
    private int velocidademax;
    private int consumomedio;

    public Veiculos(String placa, String cor, int numpassageiros, String capacitanque, int velocidademax, int consumomedio) {
        this.placa = placa;
        this.cor = cor;
        this.numpassageiros = numpassageiros;
        this.capacitanque = capacitanque;
        this.velocidademax = velocidademax;
        this.consumomedio = consumomedio;
    }


    @Override
    public String toString() {
        return "Veiculos{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numpassageiros=" + numpassageiros +
                ", capacitanque='" + capacitanque + '\'' +
                ", velocidademax=" + velocidademax +
                ", consumomedio=" + consumomedio +
                '}';
    }
}
