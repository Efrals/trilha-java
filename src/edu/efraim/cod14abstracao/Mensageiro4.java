package edu.efraim.cod14abstracao;

public class Mensageiro4 extends ServicoDeMensagens2 {
    
    public void enviarMensagem() {
        validarConexao();
        System. out. println("Enviando mensagem atarvés de mensageiro 4");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem atarvés de mensageiro 4");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico de mensageiro 4");
    }
}