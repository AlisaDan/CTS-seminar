package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IRezervare {

    public static final int NUMAR_MINIM_PERSOANE = 4;
    private final Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void anuntaRezervare() {
        if (rezervare.getNumarPersoane() >= NUMAR_MINIM_PERSOANE) {
            rezervare.anuntaRezervare();
        } else {
            System.out.println("Persoanele se pot prezenta fizic la restaurant");
        }
    }
}
