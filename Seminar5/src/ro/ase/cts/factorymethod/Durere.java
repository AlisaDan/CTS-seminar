package ro.ase.cts.factorymethod;

public class Durere extends Categorie {
    public Durere(float pretDeBaza) {
        super(pretDeBaza);
    }

    @Override
    public String toString() {
        return "Durere{" +
                "pretDeBaza=" + pretDeBaza +
                '}';
    }
}
