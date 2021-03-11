package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;
    private static float sumaFinantare=20;

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

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        return "Student: "+super.toString()+ Arrays.toString(denumiriProiecte) + "Facultate=" + facultate + ", An_studii=" + anStudii;
    }

    public int finantare() {
        int s = 20;
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }

	public static float getSumaFinantare() {
		return sumaFinantare;
	}
}
