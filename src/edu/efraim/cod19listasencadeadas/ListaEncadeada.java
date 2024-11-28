package edu.efraim.cod19listasencadeadas;

public class ListaEncadeada<T> {

    No<T> refenciaEntrada;

    public ListaEncadeada(){
        this.refenciaEntrada = null;
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
