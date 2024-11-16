package edu.efraim.cod16interface.impressora;

public class ChecarTonnerEImprimir implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("Checando Tonner...");
        System.out.println("Tonner Ok!");
        System.out.println("Imprimindo");
    }
}
