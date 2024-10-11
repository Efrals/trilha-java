package edu.efraim.cod4;
import java.util.Scanner;

public class Argumentos2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digitegfg a sua altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println();
        System.out.println("Resultado:");
        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
    }

}
