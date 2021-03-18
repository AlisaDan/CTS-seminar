package ro.ase.cts.lazy;


public class ClinicaVeterinaraLazy {
    private final String nume;
    private final String adresa;
    private final int numarMedici;
    private final float buget;
    private static ClinicaVeterinaraLazy instanta=null;

    private ClinicaVeterinaraLazy(String nume, String adresa, int numarMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarMedici = numarMedici;
        this.buget = buget;
    }
    public static ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarMedici, float buget){
        if(instanta==null){
            instanta=new ClinicaVeterinaraLazy(nume, adresa,numarMedici,buget);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "ClinicaVeterinaraLazy{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", numarMedici=" + numarMedici +
                ", buget=" + buget +
                '}';
    }
}
