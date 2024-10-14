package edu.efraim.cod5;
import java.util.Scanner;

public class condicional4Ternaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota");
        int nota = scanner.nextInt();

        scanner.close();

        String resultado = nota >= 60 ? "Aprovado" : nota >= 45 && nota <= 59 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }
}
