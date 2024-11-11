package edu.efraim.cod6repeticao;
import java.util.Scanner;

public class Repeticao2ForAprimorado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos carneiros vc precisa contar para dormir?");
        int contar = scanner.nextInt();
        scanner.close();

        for (int carneirinhos = 1; carneirinhos <= contar; carneirinhos ++) {
            System.out.println("Carneirinho número " + carneirinhos);

            if (carneirinhos == contar) 
                System.out.println("Dormiu zzz");
            else
                System.out.println("Acordado");
                System.out.println();
        }
        System.out.println("Saiu da repetição");
    }
}