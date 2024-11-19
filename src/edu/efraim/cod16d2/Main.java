package edu.efraim.cod16d2;

public class Main {
    public static void main(String[] args) {
        
        Cliente efraim = new Cliente();
        efraim.setNome("Efraim");
        
        Conta corrente = new ContaCorrente(efraim);
        Conta poupanca = new ContaPoupanca(efraim);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}
