package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.lazy.ClinicaVeterinaraLazy;

public class Program {
    public static void main(String[] args) {
        ClinicaVeterinara clinicaVeterinara = ClinicaVeterinara.getInstance();
        ClinicaVeterinara clinicaVeterinara1 = ClinicaVeterinara.getInstance();
        System.out.println(clinicaVeterinara);
        System.out.println(clinicaVeterinara1);
        ClinicaVeterinaraLazy clinicaVeterinaraLazy=ClinicaVeterinaraLazy.getInstance("clinica","str starada",6,40432.54f);
        ClinicaVeterinaraLazy clinicaVeterinaraLazy1=ClinicaVeterinaraLazy.getInstance("clinica2","str Libertatii",2,20432.54f);
        System.out.println(clinicaVeterinaraLazy);
        System.out.println(clinicaVeterinaraLazy1);
    }
}
