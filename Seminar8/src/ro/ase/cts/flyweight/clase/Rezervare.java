package ro.ase.cts.flyweight.clase;

public class Rezervare {
    private final int nrMasa;
    private final int nrPersoane;
    private final String oraRezervarii;

    public Rezervare(int nrMasa, int nrPersoane, String oraRezervarii) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervarii = oraRezervarii;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervarii='" + oraRezervarii + '\'' +
                '}';
    }
}
