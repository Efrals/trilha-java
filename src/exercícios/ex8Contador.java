package exercícios;

import java.util.Scanner;

public class ex8Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o 1º parâmetro:");
        int parametroUm =  terminal.nextInt();

        System.out.println("Digite o 2º parâmetro:");
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que que o parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O parâmetro 2 deve ser maior que o 1º");
        }

        int contagem = parametroDois - parametroUm;

        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
        System.out.println("Imprimindo número " + i);
        }   
    }
}