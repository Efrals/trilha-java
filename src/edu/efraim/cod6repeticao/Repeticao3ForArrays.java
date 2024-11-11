package edu.efraim.cod6repeticao;

public class Repeticao3ForArrays {
    public static void main(String[] args) {
        
        String cadastrados [] = {"Ana", "Maria", "João", "Kat", "Maycom"};

        for (int i = 0; i < cadastrados.length; i++) {     //(i+1) adiciona 1 no valor impresso para melhor didática
            System.out.println("O cadastrado no índice I=" + (i+1) + " é " + cadastrados [i]);
        }
    }
}