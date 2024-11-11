package edu.efraim.cod3operadores;

public class Operadores7Realacionais2Conteudo {
    public static void main(String[] args) {
        //EFICIENTE para comparar conteúdo entre variável e objeto
        String nomeVariavel = "Efraim";
        String nomeObjeto1 = new String("Efraim");
        String nomeObjeto2 = new String("Luiz");

        System.out.println("nomeVariavel é igual a nomeObjeto1? " + nomeVariavel.equals(nomeObjeto1));

        System.out.println("nomeVariavel é igual a nomeObjeto2? " + nomeVariavel.equals(nomeObjeto2));
        

        System.out.println();


        //INEFICIENTE para comparar conteúdo entre variável e objeto 
        String nome1 = "Efraim";
        String nome2 = "Efraim";

        boolean simNaoNome = nome1 == nome2;
        System.out.println("nome1 é igual a nome2? " + simNaoNome);

        simNaoNome = nome1 != nome2;
        System.out.println("nome1 é diferente de nome2? " + simNaoNome);
    }
}
