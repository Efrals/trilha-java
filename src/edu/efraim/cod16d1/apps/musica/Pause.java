package edu.efraim.cod16d1.apps.musica;

public abstract class Pause implements Player {

    @Override
    public void pause() {
        System.out.println("Pausa em Música");
    }
}
