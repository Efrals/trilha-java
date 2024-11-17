package edu.efraim.cod16d1.os;

import edu.efraim.cod16d1.apps.musica.Player;
import edu.efraim.cod16d1.apps.navegador.Navegador;
import edu.efraim.cod16d1.apps.telefone.Telefone;

public class MiniOS implements Player, Telefone, Navegador {

    @Override
    public void ligar() {
        System.out.println("Telefone está ligando");
    }

    @Override
    public void atender() {
        System.out.println("Telefone está em chamada");
    }

    @Override
    public void correioVoz() {
        System.out.println("Telefone está deixando mensagem no correio de voz");
    }

    @Override
    public void play() {
        System.out.println("Telefone está com música tocando");
    }

    @Override
    public void pause() {
        System.out.println("Telefone está com música em pausa");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("App Música está em tela de seleção de música");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Nova aba aberta no navegador");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do navegador");
    }
}
