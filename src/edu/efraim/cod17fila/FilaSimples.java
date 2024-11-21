package edu.efraim.cod17fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaSimples {
    public static void main(String[] args) {
        // Criação da fila utilizando LinkedList
        Queue<String> filaDeAtendimento = new LinkedList<>();

        // Adicionando pessoas à fila
        filaDeAtendimento.add("Ana");
        filaDeAtendimento.add("Bruno");
        filaDeAtendimento.add("Carla");
        filaDeAtendimento.add("Daniel");

        System.out.println("Fila inicial: " + filaDeAtendimento);

        // Simulando o atendimento
        while (!filaDeAtendimento.isEmpty()) {
            String atendido = filaDeAtendimento.poll(); // Remove a pessoa do início da fila
            System.out.println("Atendendo: " + atendido);
            System.out.println("Fila atual: " + filaDeAtendimento);
        }

        System.out.println("Todos foram atendidos!");
    }
}
