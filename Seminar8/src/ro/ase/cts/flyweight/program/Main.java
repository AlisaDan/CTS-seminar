package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FabricaRezervari;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1= new Rezervare(1,3,"12:00");
        Rezervare rezervare2= new Rezervare(2,4,"13:00");

        FabricaRezervari fabricaRezervari= new FabricaRezervari();
        fabricaRezervari.getClient("alisa@emai.com").afisareInformatii(rezervare1);
        fabricaRezervari.getClient("alisa@emai.com").afisareInformatii(rezervare2);

    }
}
