package edu.efraim.cod16d1;

import edu.efraim.cod16d1.apps.musica.Player;
import edu.efraim.cod16d1.apps.navegador.Navegador;
import edu.efraim.cod16d1.apps.telefone.Telefone;
import edu.efraim.cod16d1.os.MiniOS;



public class Dispositivo {
    public static void main(String[] args) {
        MiniOS mos = new MiniOS();
        Telefone telefoneos = mos;
        Player playeros = mos;
        Navegador navegadoros = mos;

        telefoneos.ligar();
        telefoneos.atender();
        telefoneos.correioVoz();

        System.out.println();

        playeros.selecionarMusica();
        playeros.play();
        playeros.pause();
        
        System.out.println();

        navegadoros.exibirPagina();
        navegadoros.adicionarPagina();
        navegadoros.atualizarPagina();
    }
}
