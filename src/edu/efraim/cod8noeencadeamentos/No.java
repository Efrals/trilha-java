package edu.efraim.cod8noeencadeamentos;

public class No {

    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getContcudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    /*
    //Com todos os campos
    @0verride
    public String toString() {
    return "No{" + 
            "conteudo= " + conteudo +
            ", proximoNo=" + proximoNo + 
            '}';
    }
    */

    //Somente com conteudo
    @Override
    public String toString() {
    return "No{" + 
            "conteudo= " + conteudo +
            '}';
    }
}
