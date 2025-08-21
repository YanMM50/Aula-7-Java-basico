package org.example.Veiculos;

public class DadosVeiculos {
    public static void main(String[] args) {
        Veiculos veiculo1 = new Veiculos("SDK87W", "Branco", 4, "55L", 487, 10);
        Cliente cliente1 = new Cliente("Yan", 24, "999999999","Estrada da liberdade","71985242246");

        System.out.println("Dados do 1º veiculo: " + veiculo1.toString());
        System.out.println("Dados do 1º Cliente: " + cliente1.toString());

    }
}
