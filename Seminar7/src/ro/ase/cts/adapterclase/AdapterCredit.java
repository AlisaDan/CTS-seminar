package ro.ase.cts.adapterclase;

public class AdapterCredit extends Leasing implements InterfataCredit{
    public AdapterCredit() {
        super();
    }

    @Override
    public void acordaCredit(String numeClient, float suma) {
        super.oferaLeasing(numeClient,suma);
    }
}
