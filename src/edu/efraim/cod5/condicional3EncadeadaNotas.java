package edu.efraim.cod5;
import java.util.Scanner;

public class condicional3EncadeadaNotas {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota:");
        int nota = scanner.nextInt();

        scanner.close();
        

        if (nota >= 60){   //Se tiver mais de 1 ação, terá de estar dentro de um bloco através de "{}"
            System.out.println("Como sua nota foi " + nota + ", você está Aprovado");
            System.out.println("Pode descansar");

        }else if (nota >= 45 && nota <= 59)
            System.out.println("Como sua nota foi " + nota + ", você está de Recuperação");

        else
            System.out.println("Como sua nota foi " + nota + ", você está Reprovado");
    }
}