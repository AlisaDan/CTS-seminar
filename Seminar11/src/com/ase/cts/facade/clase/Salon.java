package com.ase.cts.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {

    private List<Pat> paturi;

    public Salon(int numarPaturi) {
        setPaturi(numarPaturi);
    }

    private void setPaturi(int numarPaturi) {
        this.paturi = new ArrayList<>();
        for (int i = 0; i < numarPaturi; i++) {
            this.paturi.add(new Pat(i + 1, i % 2 == 0));
        }
    }

    public boolean arePaturiLibere() {
        for (Pat pat : paturi) {
            if (pat.isLiber())
                return true;
        }
        return false;
    }
}

