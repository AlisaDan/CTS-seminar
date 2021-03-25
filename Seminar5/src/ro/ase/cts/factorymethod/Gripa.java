package ro.ase.cts.factorymethod;

public class Gripa extends Categorie{
    public Gripa(float pretDeBaza) {
        super(pretDeBaza);
    }

    @Override
    public String toString() {
        return "Gripa{" +
                "pretDeBaza=" + pretDeBaza +
                '}';
    }
}
