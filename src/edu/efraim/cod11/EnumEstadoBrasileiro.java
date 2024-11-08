package edu.efraim.cod11;

public enum EnumEstadoBrasileiro {

    MINAS_GERAIS ("Minas Gerais", "mg"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "rj"),
    BAHIA ("Bahia", "bA"),
    ESPIRITO_SANTO ("Espírito Santo", "Es");

    private String nome;
    private String sigla;

    private EnumEstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla.toUpperCase();
    }

}
