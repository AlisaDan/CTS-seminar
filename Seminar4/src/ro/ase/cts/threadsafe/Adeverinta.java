package ro.ase.cts.threadsafe;

public class Adeverinta {

    private String numeStudent;
    private String prenumeStudent;
    private String tipAdeverinta;
    private int codStudent;
    private static Adeverinta adeverinta = null;

    private Adeverinta(String numeStudent, String prenumeStudent, String tipAdeverinta, int codStudent) {
        this.numeStudent = numeStudent;
        this.prenumeStudent = prenumeStudent;
        this.tipAdeverinta = tipAdeverinta;
        this.codStudent = codStudent;
    }

    public static synchronized Adeverinta getInstance(String numeStudent, String prenumeStudent, String tipAdeverinta, int codStudent) {
        if (adeverinta == null) {
            adeverinta = new Adeverinta(numeStudent, prenumeStudent, tipAdeverinta, codStudent);
        }
        return adeverinta;
    }

    @Override
    public String toString() {
        return "Adeverinta{" +
                "numeStudent='" + numeStudent + '\'' +
                ", prenumeStudent='" + prenumeStudent + '\'' +
                ", tipAdeverinta='" + tipAdeverinta + '\'' +
                ", codStudent=" + codStudent +
                '}';
    }

    public String getNumeStudent() {
        return numeStudent;
    }

    public void setNumeStudent(String numeStudent) {
        this.numeStudent = numeStudent;
    }

    public String getPrenumeStudent() {
        return prenumeStudent;
    }

    public void setPrenumeStudent(String prenumeStudent) {
        this.prenumeStudent = prenumeStudent;
    }

    public String getTipAdeverinta() {
        return tipAdeverinta;
    }

    public void setTipAdeverinta(String tipAdeverinta) {
        this.tipAdeverinta = tipAdeverinta;
    }

    public int getCodStudent() {
        return codStudent;
    }

    public void setCodStudent(int codStudent) {
        this.codStudent = codStudent;
    }
}
