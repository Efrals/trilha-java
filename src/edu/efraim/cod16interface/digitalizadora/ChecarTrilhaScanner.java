package edu.efraim.cod16interface.digitalizadora;

public class ChecarTrilhaScanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("Checando Trilha...");
        System.out.println("Scanner Ok!");
        System.out.println("Digitalizando");
    }
}
