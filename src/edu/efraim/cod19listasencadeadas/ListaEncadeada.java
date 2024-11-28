package edu.efraim.cod19listasencadeadas;

public class ListaEncadeada<T> {

    No<T> refenciaEntrada;

    public ListaEncadeada(){
        this.refenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
            for (int i = 0; i < this.size()-l; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }

        noAuxiliar.setProximoNo(novoNo);
        }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = refenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }
}
