package edu.efraim.cod14abstracao;

public class Dispositivo3 {

    public static void main(String[] args) {

        System.out.println("Herdado de Mensageiro 4");
        Mensageiro4 mensagem4 = new Mensageiro4();
        mensagem4.enviarMensagem();
        mensagem4.receberMensagem();

        System.out.println();

        System.out.println("Herdado de Mensageiro 5");
        Mensageiro5 mensagem5 = new Mensageiro5();
        mensagem5.enviarMensagem();
        mensagem5.receberMensagem();
    }
}
