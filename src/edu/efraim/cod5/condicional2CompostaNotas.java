package edu.efraim.cod5;

import java.util.Scanner;

public class condicional2CompostaNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota:");
        double nota = scanner.nextDouble();

        scanner.close();

        if (nota >= 60) { // Se tiver mais de 1 ação, terá de estar dentro de um bloco através de "{}"
            System.out.println("Como sua nota foi " + nota + ", você está Aprovado");
            System.out.println("Pode descansar");

        } else
            System.out.println("Como sua nota foi " + nota + " você está Reprovado");
    }
}