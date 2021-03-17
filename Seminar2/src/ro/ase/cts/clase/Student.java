package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    public static final int SUMA_FINANTARE_STUDENT = 20;
    protected String facultate;
    protected int anStudii;
    private static final float sumaFinantare = 20;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    @Override
    public float getSumaFinantaree() {
        return sumaFinantare;
    }

    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + Arrays.toString(denumiriProiecte) + "Facultate=" + facultate + ", An studii=" + anStudii;
    }

    public int finantare() {
        int sumaFinantare = SUMA_FINANTARE_STUDENT;
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantare + " Euro/zi in proiect.");
        return sumaFinantare;
    }

    public static float getSumaFinantare() {
        return sumaFinantare;
    }
}
