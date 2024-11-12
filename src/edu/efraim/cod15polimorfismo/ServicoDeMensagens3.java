package edu.efraim.cod15polimorfismo;

public abstract class ServicoDeMensagens3 {

    protected void validarConexao() {
        System.out.println("Validando conexão");
    }

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();
}