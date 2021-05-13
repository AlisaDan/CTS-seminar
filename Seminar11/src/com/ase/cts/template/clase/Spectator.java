package com.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract{
    @Override
    public void asezareLaCoada() {
        System.out.println("S a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println("A prezentat bilet");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println("A realizat controlul corporal");
    }

    @Override
    public void intraPeStadion() {
        System.out.println("A intrat pe stadion");
    }

    @Override
    public void ocupare() {
        System.out.println("A ocupat locul");
    }
}
