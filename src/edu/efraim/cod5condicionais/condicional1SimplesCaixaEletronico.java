package edu.efraim.cod5condicionais;
public class condicional1SimplesCaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25;
        double valorSolicitado = 10;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }

}
