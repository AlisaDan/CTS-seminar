package ro.ase.cts.state.main;

import ro.ase.cts.state.clase.Masa;

public class Program {
    public static void main(String[] args) {
        Masa masa = new Masa(1);

        masa.rezervaMasa();

        masa.rezervaMasa();
//        masa.setStare(new StareLibera());
        masa.rezervaMasa();
        masa.ocupaMasa();

        masa.elibereazaMasa();
    }
}
