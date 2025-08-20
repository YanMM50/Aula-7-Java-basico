package org.example.Veiculos;

public class DadosVeiculos {
    public static void main(String[] args) {
        Veiculos veiculo1 = new Veiculos("SDK87W", "Branco", 4, "55L", 487, 10);

        System.out.println("Dados do 1º veiculo: " + veiculo1.toString());
    }
}
