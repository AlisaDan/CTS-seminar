package utilsfortests;

import ro.ase.cts.clase.IStudent;

import java.util.Arrays;
import java.util.List;

public class StudentStub implements IStudent {
    @Override
    public String getNume() {
        return "Alisa";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return Arrays.asList(5, 6, 7);
    }

    @Override
    public void adaugaNota(int nota) {
    }

    @Override
    public float calculeazaMedie() {
        return 6;
    }

    @Override
    public int getNota(int index) {
        return 9;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
