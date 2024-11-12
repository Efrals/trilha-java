package edu.efraim.cod14abstracao;

public class Mensageiro5 extends ServicoDeMensagens2 {
    
    public void enviarMensagem() {
        validarConexao();
        System. out. println("Enviando mensagem atarvés de mensageiro 5");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem atarvés de mensageiro 5");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico de mensageiro 5");
    }
}