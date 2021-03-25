package ro.ase.cts.clase;

public  abstract class Categorie {
    float pretDeBaza;

    public Categorie(float pretDeBaza) {
        this.pretDeBaza = pretDeBaza;
    }

    public float getPretDeBaza() {
        return pretDeBaza;
    }
}
