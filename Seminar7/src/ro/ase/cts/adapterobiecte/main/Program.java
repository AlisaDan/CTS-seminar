package ro.ase.cts.adapterobiecte.main;

import ro.ase.cts.adapterobiecte.AdapterCredit;
import ro.ase.cts.adapterobiecte.InterfataCredit;
import ro.ase.cts.adapterobiecte.Leasing;

public class Program {
    public static void oferaInfoCredit(InterfataCredit credit,String numeClient, float suma){
        credit.acordaCredit(numeClient,suma);
    }

    public static void main(String[] args) {
        Leasing leasing=new Leasing();

        AdapterCredit adapterCredit=new AdapterCredit(leasing);
        oferaInfoCredit(adapterCredit,"Ionel",323.5f);
    }
}
