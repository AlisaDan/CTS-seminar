package ro.ase.cts.strategy.clase;


public class Client {
    private final String numeClient;
    private ModPlata modPlata;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    public Client(String numeClient, ModPlata modPlata) {
        this.numeClient = numeClient;
        this.modPlata = modPlata;
    }

    public void platesteNota(double sumaDePlata) {
        System.out.println(numeClient + " trebuie sa realizeze o plata");
        modPlata.plateste(sumaDePlata);
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
