package edu.efraim.cod13heranca;

public class Dispositivo2 {

    public static void main(String[] args) {

        System.out.println("Herdado de Mensageiro 2");
        Mensageiro2 mensagem2 = new Mensageiro2();
        mensagem2.enviarMensagem();
        mensagem2.receberMensagem();

        System.out.println();

        System.out.println("Herdado de Mensageiro 3");
        Mensageiro3 mensagem3 = new Mensageiro3();
        mensagem3.enviarMensagem();
        mensagem3.receberMensagem();
    }
}
