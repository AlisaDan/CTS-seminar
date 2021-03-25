package ro.ase.cts.factorymethod;

public class BodyFactory implements FactoryCategorie {

    @Override
    public Categorie creareCategorie(float pretDeBaza) {
            return new Body(pretDeBaza);}

}
