package edu.efraim.cod5;
public class condicionalSimplesCaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25;
        double valorSolicitado = 10;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }

}
