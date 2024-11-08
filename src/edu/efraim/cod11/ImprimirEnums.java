package edu.efraim.cod11;

public class ImprimirEnums {

    public static void main(String[] args) {
        
        for (EnumEstadoBrasileiro eb: EnumEstadoBrasileiro.values()) {
            System.out.println(eb.getNome() + " - " + eb.getSigla());
        }

    }
}
