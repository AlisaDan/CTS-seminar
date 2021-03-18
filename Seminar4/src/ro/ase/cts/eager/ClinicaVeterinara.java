package ro.ase.cts.eager;

public class ClinicaVeterinara {
    private final String nume;
    private final String adresa;
    private final int numarMedici;
    private final float buget;
    //instanta este initializata la momentul declararii la Eager initialization
    private static final ClinicaVeterinara clinicaVeterinara = new ClinicaVeterinara("Clinica Vet", "str Dorobanti ", 5, 3000.2f);
    // constructorul obligatoriu trebuie sa fie private
    private ClinicaVeterinara(String nume, String adresa, int numarMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarMedici = numarMedici;
        this.buget = buget;
    }
    //Functia statica va returna instanta
    public static ClinicaVeterinara getInstance(){
        return clinicaVeterinara;
    }

    @Override
    public String toString() {
        return "ClinicaVeterinara{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", numarMedici=" + numarMedici +
                ", buget=" + buget +
                '}';
    }
}
