package com.ase.cts.template.clase;

public class SpectatorPeluza extends SpectatorAbstract{
    @Override
    public void asezareLaCoada() {
        System.out.println("Spectatorul de peluza s a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println("Spectatorul a prezentat biletul");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println("Spectatorul a realizat controlul corporal");
    }

    @Override
    public void intraPeStadion() {
        System.out.println("Spectatorul a intrat pe peluza");
    }

    @Override
    public void ocupare() {
        System.out.println("Spectatorul a ocupat locul pe peluza");
    }
}
