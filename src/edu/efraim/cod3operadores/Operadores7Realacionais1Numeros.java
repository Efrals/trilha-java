package edu.efraim.cod3operadores;

public class Operadores7Realacionais1Numeros {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNaoNumero = numero1 == numero2;
        if (numero1 == numero2) {
            System.out.println("a condição de igualdade é verdadeira");
        }
        System.out.println("numero1 é igual a numero2? " + simNaoNumero);

        simNaoNumero = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + simNaoNumero);
        if (numero1 != numero2) {
            System.out.println("a condição de diferente é verdadeira");
        }
        
        simNaoNumero = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simNaoNumero);
        
        simNaoNumero = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual a numero2? " + simNaoNumero);
        
        simNaoNumero = numero1 < numero2;
        System.out.println("numero1 é menor que numero2? " + simNaoNumero);
        
        simNaoNumero = numero1 <= numero2;
        System.out.println("numero1 é menor ou igual a numero2? " + simNaoNumero);
    }
}
