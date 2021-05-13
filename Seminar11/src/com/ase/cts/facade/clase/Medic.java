package com.ase.cts.facade.clase;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public boolean esteNecesaraInternarea(Pacient pacient){
        return pacient.isEsteInStareGrava();
    }
}
