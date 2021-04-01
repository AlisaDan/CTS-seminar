package ro.ase.cts.sportiv.builderv1.clase;

public class RezervareBuilder implements Builder{
    private Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(false, false, false, false, "gen", 1);

    }
public  RezervareBuilder(int codRezervare){
    rezervare = new Rezervare(false, false, false, false, "gen", codRezervare);

}
    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        this.rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }


    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }


    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.rezervare.setBauturaRacoritoare(bauturaRacoritoare);
        return this;
    }


    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }


    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }


    public RezervareBuilder setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}