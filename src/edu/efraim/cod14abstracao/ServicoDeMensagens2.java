package edu.efraim.cod14abstracao;

public abstract class ServicoDeMensagens2 {

    protected void validarConexao() {
        System.out.println("Validando conexão");
    }

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();
}
