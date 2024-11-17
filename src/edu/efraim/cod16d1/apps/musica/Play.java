package edu.efraim.cod16d1.apps.musica;

public abstract class Play implements Player {

    @Override
    public void play() {
        System.out.println("Tocando Música");
    }
}
