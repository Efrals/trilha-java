package edu.efraim.cod16interface.multifuncional;

import edu.efraim.cod16interface.digitalizadora.Digitalizadora;
import edu.efraim.cod16interface.impressora.Impressora;

public class Multifuncional implements Digitalizadora, Impressora {

    @Override
    public void digitalizar() {
        System.out.println("Multifuncional está Digitalizando");
    }

    @Override
    public void imprimir() {
        System.out.println("Multifuncional está Imprimindo");
    }
}
