package ro.ase.cts.sportiv.builderv2.clase;

import ro.ase.cts.sportiv.builderv1.clase.Rezervare;

public class RezervareBuilder implements Builder{
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private String genMuzica;
    private int codRezervare;

    public RezervareBuilder() {
        this.scaunErgonomic = false;
        this.bauturaRacoritoare = false;
        this.muzicaAmbientala = false;
        this.genMuzica = "gen";
        this.codRezervare = 1;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public RezervareBuilder setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(mancareInclusa,scaunErgonomic,bauturaRacoritoare,muzicaAmbientala,genMuzica,codRezervare);
    }
}
