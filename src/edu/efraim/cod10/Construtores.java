package edu.efraim.cod10;

public class Construtores {

    public static void main(String[] args) {
        
        //definido através do construtor
        Pessoa efraim = new Pessoa("123456789", "Rua 1", "Efraim");

        //definido através do set
        efraim.setCorDosOlhos("castanhos");

        System.out.println("Nome: " + efraim.getNome());
        System.out.println("CPF:  " + efraim.getCpf());
        System.out.println("Endereço: " + efraim.getEndereço());
        System.out.println("Cor dos olhos: " + efraim.getCorDosOlhos());
    }
}