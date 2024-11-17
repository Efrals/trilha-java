package edu.efraim.cod16d1.apps.navegador;

public abstract class AdicionarPagina implements Navegador{

    @Override
    public void adicionarPagina() {
        System.out.println("Nova Aba Adicionada");
    }
}
