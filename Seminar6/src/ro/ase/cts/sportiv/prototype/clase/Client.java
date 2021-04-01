package ro.ase.cts.sportiv.prototype.clase;

public class Client implements AbstractPrototype {
    private int codClient;
    private String nume;
    private int varsta;

    public Client(int codClient, String nume, int varsta) {
        this.codClient = codClient;
        this.nume = nume;
        //validare varsta
        this.varsta = varsta;
    }

    private Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "codClient=" + codClient +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public AbstractPrototype copiaza() {
        Client client = new Client();
        client.codClient = this.codClient;
        this.nume = client.nume;
        client.varsta = this.varsta;

        return client;
    }

}
