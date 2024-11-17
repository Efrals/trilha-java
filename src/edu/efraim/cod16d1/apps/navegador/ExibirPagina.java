package edu.efraim.cod16d1.apps.navegador;

public abstract class ExibirPagina implements Navegador{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }
}
