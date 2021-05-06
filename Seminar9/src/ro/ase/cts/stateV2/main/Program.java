package ro.ase.cts.stateV2.main;

import ro.ase.cts.stateV2.clase.Masa;

public class Program {
    public static void main(String[] args) {
        Masa masa= new Masa(1);

        masa.rezervaMasa();

        masa.rezervaMasa();
        masa.rezervaMasa();

        masa.ocupaMasa();

        masa.elibereazaMasa();
    }
}
