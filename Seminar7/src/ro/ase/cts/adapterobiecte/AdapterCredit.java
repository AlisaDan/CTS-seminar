package ro.ase.cts.adapterobiecte;

public class AdapterCredit implements InterfataCredit{
    private final Leasing leasing;

    public AdapterCredit(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void acordaCredit(String numeClient, float suma) {
        this.leasing.oferaLeasing(numeClient,suma);
    }
}
