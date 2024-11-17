package edu.efraim.cod16d1.apps.telefone;

public abstract class CorreioVoz implements Telefone{

    @Override
    public void correioVoz() {
        System.out.println("Deixando mensagem em correio de voz");
    }
}
