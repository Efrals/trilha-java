package edu.efraim.cod6repeticao;

public class Repeticao4ForEachArrays {
    public static void main(String[] args) {
        
        String cadastrados [] = {"Ana", "Maria", "João", "Kat", "Maycom"};

        //Forma abreviada
        for (String cadaCadastrado : cadastrados) {
            System.out.println("O nome do cadastrado é: " + cadaCadastrado);
        }
    }
}