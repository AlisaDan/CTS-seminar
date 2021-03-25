package ro.ase.cts.factorymethod;

public  abstract class Categorie {
    float pretDeBaza;

    public Categorie(float pretDeBaza) {
        this.pretDeBaza = pretDeBaza;
    }

    public float getPretDeBaza() {
        return pretDeBaza;
    }
}
