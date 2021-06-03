package utilsfortests;

import ro.ase.cts.clase.IStudent;

import java.util.List;

public class FakeStudent implements IStudent {
    private String nume;
    private float medie;
    private boolean areRestanta;

    public FakeStudent(String nume, float medie, boolean areRestanta) {
        this.nume = nume;
        this.medie = medie;
        this.areRestanta = areRestanta;
    }

    public FakeStudent() {
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public void setAreRestanta(boolean areRestanta) {
        this.areRestanta = areRestanta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return medie;
    }

    @Override
    public int getNota(int index) {
        return 0;
    }

    @Override
    public boolean areRestante() {
        return areRestanta;
    }
}
