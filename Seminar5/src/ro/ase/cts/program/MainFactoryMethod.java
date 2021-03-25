package ro.ase.cts.program;

import ro.ase.cts.factorymethod.Categorie;
import ro.ase.cts.factorymethod.FactoryCategorie;
import ro.ase.cts.factorymethod.FactoryGripa;

public class MainFactoryMethod {

    public static FactoryCategorie getTipFactory() {
        return new FactoryGripa();
    }

    public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
        Categorie categorie = factoryCategorie.creareCategorie(pretDeBaza);
        System.out.println(categorie);
    }

    public static void main(String[] args) {
        printeazaCategorie(getTipFactory(), 34.43f);
    }
}
