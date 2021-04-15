package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.IRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;
import ro.ase.cts.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervarePentruDouaPersoae= new Rezervare(3,2);
        rezervarePentruDouaPersoae.anuntaRezervare();

        IRezervare proxyRezervare=new ProxyRezervare((Rezervare) rezervarePentruDouaPersoae);
        proxyRezervare.anuntaRezervare();

        (((Rezervare) rezervarePentruDouaPersoae)).setNumarPersoane(6);
        proxyRezervare.anuntaRezervare();
    }
}
