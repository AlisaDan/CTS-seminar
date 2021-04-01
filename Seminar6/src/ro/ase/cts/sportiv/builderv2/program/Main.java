package ro.ase.cts.sportiv.builderv2.program;

import ro.ase.cts.sportiv.builderv1.clase.Rezervare;
import ro.ase.cts.sportiv.builderv2.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        rezervareBuilder.setBauturaRacoritoare(true);
        rezervareBuilder.setMuzicaAmbientala(true);

        Rezervare rezervare=rezervareBuilder.setCodRezervare(1).build();
        System.out.println(rezervare);
        Rezervare rezervare2=rezervareBuilder.setCodRezervare(2).build();
        System.out.println(rezervare2);
    }
}
