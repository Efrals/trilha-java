package exercícios;

import java.util.Scanner;

public class ex8Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        
        int parametroUm = terminal.??;
        int parametroDois = terminal.??;
        
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {

            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }
    
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que que o parametroDois e lançar a exceção
        
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
    }
}