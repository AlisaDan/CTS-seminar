package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {

    public static final int SUMA_FINANTARE_ANGAJAT = 10;
    private String ocupatie;
    private int salariu;
    private static float sumaFinantare = 10;

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    @Override
    public float getSumaFinantaree() {
        return sumaFinantare;
    }

    public Angajat() {
        super();

    }

    @Override
    public String toString() {
        return "Angajat:" + super.toString()
                + Arrays.toString(denumiriProiecte) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }


    public int finantare() {
        int suma = SUMA_FINANTARE_ANGAJAT;
        // TODO Auto-generated method stub
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + suma + " Euro/zi in proiect.");
        return suma;
    }

    public static void setSumaFinantare(float sumaFinantare) {
        Angajat.sumaFinantare = sumaFinantare;
    }

    public static float getSumaFinantare() {
        return sumaFinantare;
    }
}
