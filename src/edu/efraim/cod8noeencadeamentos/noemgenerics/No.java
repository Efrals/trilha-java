package edu.efraim.cod8noeencadeamentos.noemgenerics;

public class No<T> {

    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getContcudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
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
