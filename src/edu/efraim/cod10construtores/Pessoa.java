package edu.efraim.cod10construtores;

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;
    private String corDosOlhos;

    //Evitar passar campos não obrigatórios
    //É obrigatório passar dados indicados em construtores
    //Irá passar nome e cpf através de construtores
    //Construtores são muito parecidos com o método set
    public Pessoa(String cpf, String endereco, String nome) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
    }

    //Criar um construtor sem atributos é uma boa prática para melhor compatibilidade com frameworks
    //Serão encontrados os 2 construtores (Com e sem atributos) por estarem públicos
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereço() {
        return endereco;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    
}
