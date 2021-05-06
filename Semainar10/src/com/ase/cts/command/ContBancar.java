package com.ase.cts.command;

public class ContBancar {
    private final String numeDetinator;
    private float suma;

    public ContBancar(String numeDetinator) {
        this.numeDetinator = numeDetinator;
        this.suma = 0;
    }

    public void constituire(float suma) {
        this.suma = suma;
        System.out.println("Contul lui " + numeDetinator + " a fost constituit cu suma de " + suma);
    }

    public void retragere(float suma) {
        if (this.suma >= suma) {
            this.suma = this.suma - suma;
            System.out.println("Retragerea de suma " + suma + " a fost facuta");
        } else {
            System.out.println("Fonduri insuficiente");
        }
    }

    public void depundere(float suma) {
        this.suma = this.suma + suma;
        System.out.println("Suma de " + suma + " a fost depusa");
    }
}
