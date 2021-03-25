package ro.ase.cts.simplefactory.clase;

public class Body extends Categorie{
    public Body(float pretDeBaza) {
        super(pretDeBaza);
    }

    @Override
    public String toString() {
        return "Body{" +
                "pretDeBaza=" + pretDeBaza +
                '}';
    }
}
