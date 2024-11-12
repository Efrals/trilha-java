package edu.efraim.cod15polimorfismo;
import java.util.Scanner;

public class Dispositivo4 {

    public static void main(String[] args) {

        ServicoDeMensagens3 sm = null;

        String mensageiroEscolhido;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual mensageiro deseja usar?");
            System.out.println("Digite 1m para mensageiro 1 e 2m para mensageiro 2");
            mensageiroEscolhido = scanner.next();
        }

        System.out.println();

        if(mensageiroEscolhido.equals("1m"))
            sm = new Mensageiro6();
        else if(mensageiroEscolhido.equals("2m"))
            sm = new Mensageiro7();

        sm.enviarMensagem();
        sm.receberMensagem();
        sm.salvarHistoricoMensagem();
    }
}