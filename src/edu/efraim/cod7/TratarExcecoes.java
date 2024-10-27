package edu.efraim.cod7;

import java.util.Scanner;

/*
try {
    bloco de código conforme esperado
}
catch (Exception e) {
    precisamos saber qual exceção
    bloco de código que captura as exceções que podem acontecer
    em caso de um fluxo não previsto
}
*/

public class TratarExcecoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        try {
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite seu peso:");
            double peso = scanner.nextDouble();

            scanner.close();
        } catch (java.util.InputMismatchException exc) {
            System.out.println("Idade tem de ser número inteiro e Peso tem de numérico com vírgula. Ex: 75,5");
        }
    }
}