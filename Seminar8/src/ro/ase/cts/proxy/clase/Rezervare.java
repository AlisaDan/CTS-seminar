package ro.ase.cts.proxy.clase;

public class Rezervare implements IRezervare {

    private final int numarMasa;
    private  int numarPersoane;

    public Rezervare(int numarMasa, int numarPersoane) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    @Override
    public void anuntaRezervare() {
        System.out.println("Masa cu numar "+ numarMasa+ " a fost ocupata de "+ numarPersoane +" persoane");
    }
}
