package edu.efraim.cod13heranca;

public class ServicoDeMensagens {
    private void validarConexao() {
        System.out.println("Validando conexão");
    }

    public void enviarMensagem() {
        validarConexao();
        System. out. println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico");
    }
}
