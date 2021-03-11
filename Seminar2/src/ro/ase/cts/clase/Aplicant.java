package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int numarProiecte;
    protected String[] denumiriProiecte;



    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

	public abstract float getSumaFinantaree();

	public void afiseazaStatus(Proiect proiect) {
		System.out.print("Aplicantul "+nume+" "+ prenume);
        if (punctaj > proiect.getPragAdmitere())
            System.out.println(" a fost acceptat.");
        else
            System.out.println(" nu a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Aplicant{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", numarProiecte=" + numarProiecte +
                ", denumiriProiecte=" + Arrays.toString(denumiriProiecte) +
                '}';
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.numarProiecte = numarProiecte;
        this.denumiriProiecte = denumiriProiecte;
    }

    public int getNumarProiecte() {
        return numarProiecte;
    }

    public void setNumarProiecte(int numarProiecte, String[] denumiriProiecte) {
        this.numarProiecte = numarProiecte;
        this.denumiriProiecte = denumiriProiecte;
    }

}
