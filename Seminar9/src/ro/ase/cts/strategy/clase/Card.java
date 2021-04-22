package ro.ase.cts.strategy.clase;

public class Card implements ModPlata {
    private double sold;

    public Card(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double sumaPlatita) {
        if (sold >= sumaPlatita) {
            System.out.println("Plata a fost efectuata cu cardul " + sumaPlatita);
            sold -= sumaPlatita;
        } else {
            System.out.println("Fonduri insuficiente");
        }
    }
}
