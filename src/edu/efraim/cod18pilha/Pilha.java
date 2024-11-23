package edu.efraim.cod18pilha;

import java.util.Stack;

public class Pilha {
    
    public static void main(String[] args) {
        
        // Criando uma pilha de inteiros
        Stack<Integer> pilha = new Stack<>();
    
        // Adiciona elementos na pilha (push)
        System.out.println("Adicionando elementos na pilha:");
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
    
        // Exibir elementos que estão na pilha
        System.out.println("Pilha após adicionar elementos: " + pilha);
    
        // Remover elementos da pilha (pop)
        System.out.println("\nRemovendo elementos da pilha:");
        while (!pilha.isEmpty()) {
            System.out.println();
            System.out.println("Elemento removido: " + pilha.pop());
                System.out.println("Pilha atual: " + pilha);
        }
    }
}
