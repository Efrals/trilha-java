package edu.efraim.cod6repeticao;
import java.util.Random;

    /*
        //Enquanto a condição for válida será executado
        //TESTA A CONDIÇÃO ->->-> DEPOIS <-<-<- DE EXECUTAR O CÓDIGO
        //estrutura do controle de fluxo do while
        do
        {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
        }
        while (expressao booleana de validação);
    */

public class Repeticao7DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            //executa repetidas vezes até atender
            System.out.println("Telefone tocando");

        }while (tocando());

        System.out.println("Alouuu!!");

    }
    
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(4) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando (expressão booleana)
        return ! atendeu;
    }
}
