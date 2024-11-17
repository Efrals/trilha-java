package edu.efraim.cod16d1.apps.telefone;

public abstract class Atender implements Telefone{

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }
}
