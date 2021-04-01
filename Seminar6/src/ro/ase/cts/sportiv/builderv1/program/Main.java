package ro.ase.cts.sportiv.builderv1.program;


import ro.ase.cts.sportiv.builderv1.clase.Rezervare;
import ro.ase.cts.sportiv.builderv1.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
       Rezervare rezervare= new RezervareBuilder().setCodRezervare(2).setBauturaRacoritoare(true).build();
        System.out.println(rezervare);

        Rezervare rezervare1= new RezervareBuilder().setCodRezervare(3).setGenMuzica("rock").setBauturaRacoritoare(true).build();
        System.out.println(rezervare1);

        Rezervare rezervare2= new RezervareBuilder(3).setMancareInclusa(true).setGenMuzica("rock").build();
        System.out.println(rezervare2);
    }
}
