package edu.efraim.cod3;

public class Operadores8Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

    if (condicao1 && condicao2) {
        System.out.println("As duas condições são verdadeiras");
    }

    if (condicao1 || condicao2) {
        System.out.println("Uma das duas condições é verdadeira");
    }

    if (condicao1 && (3 < 5)) {
        System.out.println("A condiççao é verdadeira e 3 é menor que 5");
    }
    }
}