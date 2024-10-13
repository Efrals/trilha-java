package edu.efraim.cod3;

public class Operadores6Ternarios {
    public static void main(String[] args) {
        int a, b;

        a = 7;
        b = 8;

        //somente para operações booleanas
        String resultado = a!=b ? "Verdadeiro" : "Falso";

        int resultado2 = a!=b ? 1 : 0;

        // a expressão acima simplifica esta parte abaixo. REVISAR, IF mal implementado
        if (a==b)
            resultado = "Falso";
        else
            resultado = "Verdadeiro";
        //

        System.out.println(resultado);

        System.out.println(resultado2);
    }
}
