package edu.efraim.cod2;

public class TiposVariaveisConstante {
    public static void main(String[] args) {
        final int NUMERO = 5;
        
        //não executará a ação seguinte por variável NUMERO ser declarado constante anteriormente
        //convensionado a variável constante ser sempre em CAIXA_ALTA
        NUMERO = 10;

        System.out.println(NUMERO);
    }
}
