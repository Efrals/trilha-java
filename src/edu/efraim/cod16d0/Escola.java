package edu.efraim.cod16d0;

//1º cria um molde
// Criando objetos a partir da classe Estudante
public class Escola {
    
    public static void main(String[] args) throws Exception {
    Estudante estudante1 = new Estudante() ;
    estudante1.nome = "Efraim";
    estudante1.idadde = 30;
    estudante1.cor = Cor.DARK;
    estudante1.sexo = Sexo.MASCULINO;
    
    Estudante estudante2 = new Estudante() ;
    estudante2.nome = "Elionenai";
    estudante2.idadde = 28;
    estudante2.cor = Cor.DARK;
    estudante2.sexo = Sexo.MASCULINO;

    Estudante estudante3 = new Estudante() ;
    estudante3.nome = "Sabrini";
    estudante3.idadde = 24;
    estudante3.cor = Cor.DARK;
    estudante3.sexo = Sexo.FEMININO;
}