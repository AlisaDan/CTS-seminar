package com.ase.cts.facade.clase;

public class Pacient {
    private final String numePacient;
    private final boolean esteInStareGrava;

    public Pacient(String numePacient, boolean esteInStareGrava) {
        this.numePacient = numePacient;
        this.esteInStareGrava = esteInStareGrava;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public boolean isEsteInStareGrava() {
        return esteInStareGrava;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", esteInStareGrava=" + esteInStareGrava +
                '}';
    }
}
