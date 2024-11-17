package edu.efraim.cod16d1.apps.telefone;

public abstract class Ligar implements Telefone{

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }
}
