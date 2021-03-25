package ro.ase.cts.program;

import ro.ase.cts.simplefactory.clase.*;

public class Main {
    public static CategoriiMedicamente getTipCategorie(){
        return CategoriiMedicamente.raceala;
    }
    public static void main(String[] args) {
        try {
            CategorieFactory factory = new CategorieFactory();
            Categorie durere = factory.creareCategorie(CategoriiMedicamente.durere, 24.5f);
            Categorie body = factory.creareCategorie(CategoriiMedicamente.body, 24.5f);
            Categorie categorie = factory.creareCategorie(getTipCategorie(), 54.5f);
            System.out.println(durere);
            System.out.println(body);
            System.out.println(categorie);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
