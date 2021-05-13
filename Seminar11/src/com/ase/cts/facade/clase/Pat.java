package com.ase.cts.facade.clase;

public class Pat {
    private int numarPat;
    private boolean liber;

    public Pat(int numarPat, boolean liber) {
        this.numarPat = numarPat;
        this.liber = liber;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public boolean isLiber() {
        return liber;
    }

    public void setLiber(boolean liber) {
        this.liber = liber;
    }

    @Override
    public String toString() {
        return "Pat{" +
                "numarPat=" + numarPat +
                ", liber=" + liber +
                '}';
    }
}
