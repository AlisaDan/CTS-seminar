package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant {

    public static final int SUMA_FINANTARE_ELEV = 30;
    private int clasa;
    private String tutore;
    private static float sumaFinantare = 30;

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        return "Elev: " + super.toString() + Arrays.toString(denumiriProiecte) + "Clasa=" + clasa + ", Tutore=" + tutore;
    }

    @Override
    public float getSumaFinantaree() {
        return sumaFinantare;
    }

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public int finantare() {
        int sumaFinantare = SUMA_FINANTARE_ELEV;
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantare + " Euro/zi in proiect.");
        return sumaFinantare;
    }

    public static void setSumaFinantare(float sumaFinantare) {
        Elev.sumaFinantare = sumaFinantare;
    }

    public static float getSumaFinantare() {
        return sumaFinantare;
    }
}
