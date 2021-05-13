package com.ase.cts.facade.main;

import com.ase.cts.facade.clase.FacadeInternarePacient;
import com.ase.cts.facade.clase.Pacient;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1=new Pacient("Dani",false);
        Pacient pacient2=new Pacient("Catalin",true);

        System.out.println(FacadeInternarePacient.verificaPacient(pacient1));
        System.out.println(FacadeInternarePacient.verificaPacient(pacient2));
    }
}
