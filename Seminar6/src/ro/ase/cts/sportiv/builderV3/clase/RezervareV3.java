package ro.ase.cts.sportiv.builderV3.clase;


public class RezervareV3 {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private String genMuzica;
    private int codRezervare;

    private RezervareV3(RezervareBuilderV3 builder) {
        this.mancareInclusa = builder.mancareInclusa;
        this.scaunErgonomic = builder.scaunErgonomic;
        this.bauturaRacoritoare = builder.bauturaRacoritoare;
        this.muzicaAmbientala = builder.muzicaAmbientala;
        this.genMuzica = builder.genMuzica;
        this.codRezervare = builder.codRezervare;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public boolean isBauturaRacoritoare() {
        return bauturaRacoritoare;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public static RezervareBuilderV3 builder() {
        return new RezervareBuilderV3();
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoare=" + bauturaRacoritoare +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                ", codRezervare=" + codRezervare +
                '}';
    }

    public static class RezervareBuilderV3 implements BuilderV3 {
        private boolean mancareInclusa;
        private boolean scaunErgonomic;
        private boolean bauturaRacoritoare;
        private boolean muzicaAmbientala;
        private String genMuzica;
        private int codRezervare;

        public RezervareBuilderV3() {

        }
        public RezervareBuilderV3 setMancareInclusa(boolean mancareInclusa) {
            this.mancareInclusa = mancareInclusa;
            return this;
        }

        public RezervareBuilderV3 setScaunErgonomic(boolean scaunErgonomic) {
            this.scaunErgonomic = scaunErgonomic;
            return this;
        }

        public RezervareBuilderV3 setBauturaRacoritoare(boolean bauturaRacoritoare) {
            this.bauturaRacoritoare = bauturaRacoritoare;
            return this;
        }

        public RezervareBuilderV3 setMuzicaAmbientala(boolean muzicaAmbientala) {
            this.muzicaAmbientala = muzicaAmbientala;
            return this;
        }

        public RezervareBuilderV3 setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        public RezervareBuilderV3 setCodRezervare(int codRezervare) {
            this.codRezervare = codRezervare;
            return this;
        }


        public RezervareV3 build() {
            return new RezervareV3(this);
        }
    }
}