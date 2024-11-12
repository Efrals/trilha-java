package edu.efraim.cod16interface.sistema;

import edu.efraim.cod16interface.impressora.ChecarTonnerEImprimir;
import edu.efraim.cod16interface.impressora.Impressora;
import edu.efraim.cod16interface.multifuncional.Multifuncional;
import edu.efraim.cod16interface.digitalizadora.ChecarTrilhaScanner;
import edu.efraim.cod16interface.digitalizadora.Digitalizadora;

public class Computador {
    public static void main(String[] args) {
        Multifuncional multi = new Multifuncional();
        Impressora impressoraMulti = multi;
        Digitalizadora digitalizadoraMulti = multi;

        impressoraMulti.imprimir();
        digitalizadoraMulti.digitalizar();

        System.out.println();

        System.out.println("Imprimindo direto da classe");
        Impressora impressoraDireta = new ChecarTonnerEImprimir();
        impressoraDireta.imprimir();

        System.out.println();

        System.out.println("Escaneando direto da classse");
        Digitalizadora digitalizadoraDireta = new ChecarTrilhaScanner();
        digitalizadoraDireta.digitalizar();
    }
}
