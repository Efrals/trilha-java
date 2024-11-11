package edu.efraim.cod6repeticao;

public class Repeticao5ContinueBreak {
    public static void main(String[] args) {
        
        //com continue;
        System.out.println("Com continue em 2 ou 4");
        for (int numero = 0; numero <= 5; numero++) {
            if (numero == 2 || numero == 4)
                continue;
                System.out.println(numero);
        }

        System.out.println();
        
        //com break;
        System.out.println("Com break em 2");
        for (int numero = 0; numero <= 5; numero++) {
            if (numero == 2)
                break;
                System.out.println(numero);
        }

    }
}
