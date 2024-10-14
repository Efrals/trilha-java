package edu.efraim.cod6;
import java.util.concurrent.ThreadLocalRandom;  //Gera valores aleatórios

    /*
        //Enquanto a condição for válida será executado
        //TESTA A CONDIÇÃO ->->-> ANTES <-<-<- DE EXECUTAR O CÓDIGO
        //estrutura do controle de fluxo while
        while (expressao booleana de validação)
        {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
        }
    */

public class Repeticao6While {
    public static void main(String[] args) {
    
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            
            //verificação para maior precisão (elimina valor negativo)
            if (valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println("Doce de valor: " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda a mesada");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1, 8);
    }
}
