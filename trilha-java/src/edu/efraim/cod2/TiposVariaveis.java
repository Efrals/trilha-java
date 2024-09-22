package edu.efraim.cod2;

public class TiposVariaveis {
    public static void main(String[] args) {
        short numeroCurto = 741;
        int numeroNormal = numeroCurto;
                            //(short) faz um cast para converter para um tipo inferior 
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto);
    }
}
