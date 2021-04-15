package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.OptiuniMeniu;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        OptiuniMeniu meniu= new Sectiune("Meniu restaurant");

        OptiuniMeniu bauturi= new Sectiune("bauturi");
        OptiuniMeniu desert= new Sectiune("desert");

        OptiuniMeniu frappe= new Item("frappe");
        OptiuniMeniu apaPlata= new Item("apa plata");
        OptiuniMeniu clatite= new Item("clatite");

        bauturi.adaugaNod(frappe);
        bauturi.adaugaNod(apaPlata);

        desert.adaugaNod(clatite);

        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);

        meniu.descriere();

        bauturi.stergeNod(frappe);

        desert.adaugaNod(frappe);

        meniu.descriere();
    }
}
