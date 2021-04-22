package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Alisa");
        client.setModPlata(new Cash());
        client.platesteNota(200.00);

        client.setModPlata(new Card(400.32));
        client.platesteNota(300.00);

        client.platesteNota(150.342);
    }
}
