package edu.efraim.cod15polimorfismo;

public class Mensageiro7 extends ServicoDeMensagens3 {
    
    public void enviarMensagem() {
        validarConexao();
        System. out. println("Enviando mensagem atarvés de mensageiro 7");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem atarvés de mensageiro 7");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico de mensageiro 7");
    }
}