package ro.ase.cts.factorymethod;

public class DurereFactory implements FactoryCategorie {

    @Override
    public Categorie creareCategorie(float pretDeBaza) {
        return new Durere(pretDeBaza);
    }

}
