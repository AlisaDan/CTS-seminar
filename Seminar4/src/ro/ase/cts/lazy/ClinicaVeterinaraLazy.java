package ro.ase.cts.lazy;


public class ClinicaVeterinaraLazy {
    private  String nume;
    private final String adresa;
    private  int numarMedici;
    private final float buget;
    private static ClinicaVeterinaraLazy instanta=null;

    private ClinicaVeterinaraLazy(String nume, String adresa, int numarMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarMedici = numarMedici;
        this.buget = buget;
    }
    public static synchronized ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarMedici, float buget){
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

    public String getNume() {
        return nume;
    }

    public int getNumarMedici() {
        return numarMedici;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNumarMedici(int numarMedici) {
        this.numarMedici = numarMedici;
    }
}
