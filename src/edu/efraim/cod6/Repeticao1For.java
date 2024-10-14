package edu.efraim.cod6;

/*
    estrutura do controle de fluxo for
    for (bloco de inicialização; expressão booleana de validação; bloco de incrementação){
        // comando que será executado até que a
        // expressão de validação torne—se falsa
    }
    */

public class Repeticao1For {
    public static void main(String[] args) {
    
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++) {
            System.out.println("Carneirinho número " + carneirinhos);

            if (carneirinhos == 20) 
                System.out.println("Dormiu zzz");
            else
                System.out.println("Acordado");
                System.out.println();
        }
        System.out.println("Saiu da repetição");
    }
}