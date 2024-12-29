package edu.efraim.cod19encadeamento;

public class No<T> {

    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("No{");
        sb.append("conteudo=").append(conteudo);
        sb.append(", proximoNo=").append(proximoNo);
        sb.append('}');
        return sb.toString();

        if(proximoNo != null){
            str += "-> " + proximoNo.toString();
        } else {
            str += "-> null";
        }
            return str;
    }
}
