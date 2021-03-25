package ro.ase.cts.factorymethod;

public class RacealaFactory implements FactoryCategorie {
    @Override
    public Categorie creareCategorie(float pretDeBaza) {
        return new Raceala(pretDeBaza);
    }
}
