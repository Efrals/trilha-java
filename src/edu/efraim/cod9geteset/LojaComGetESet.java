package edu.efraim.cod9geteset;

public class LojaComGetESet {

    public static void main(String[] args) {
        
        PecaComGetESet parafuso = new PecaComGetESet();

        parafuso.setNome("Parafuso");
        parafuso.setId(1);

        System.out.println("A peça de ID " + parafuso.getId() + " é um " + parafuso.getNome());
    }
}
