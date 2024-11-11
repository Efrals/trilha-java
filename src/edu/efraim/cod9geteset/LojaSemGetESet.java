package edu.efraim.cod9geteset;

public class LojaSemGetESet {

    public static void main(String[] args) {
        
        PecaSemGetESet parafuso = new PecaSemGetESet();

        parafuso.nome = "Parafuso";
        parafuso.id = 1;

        System.out.println("A peça de ID " + parafuso.id + " é um " + parafuso.nome);
    }
}
