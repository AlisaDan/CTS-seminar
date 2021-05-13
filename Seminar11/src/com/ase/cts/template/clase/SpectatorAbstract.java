package com.ase.cts.template.clase;

public abstract class SpectatorAbstract {

    public abstract void asezareLaCoada();

    public abstract void prezintaBilet();

    public abstract void realizeazaControlCorporal();

    public abstract void intraPeStadion();

    public abstract void ocupare();

    public final void intrareaSpectatoruluiPeStadion() {
        asezareLaCoada();
        prezintaBilet();
        realizeazaControlCorporal();
        intraPeStadion();
        ocupare();
    }
}
