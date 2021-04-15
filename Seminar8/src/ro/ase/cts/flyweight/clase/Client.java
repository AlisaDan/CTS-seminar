package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract {

    private final String nume;
    private final String numarTelefon;
    private final String email;

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public void afisareInformatii(Rezervare rezervare) {
        System.out.println(toString() + rezervare.toString());
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
