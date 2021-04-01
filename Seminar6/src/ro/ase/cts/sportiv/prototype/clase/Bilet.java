package ro.ase.cts.sportiv.prototype.clase;

public class Bilet implements AbstractPrototype{
    private int cod;
    private String echipaA;
    private String echipaB;
    private String data;

    public Bilet(int cod, String echipaA, String echipaB, String data) {
        this.cod = cod;
        this.echipaA = echipaA;
        this.echipaB = echipaB;
        this.data = data;
    }

    private Bilet() {
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "cod=" + cod +
                ", echipaA='" + echipaA + '\'' +
                ", getEchipab='" + echipaB + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public AbstractPrototype copiaza() {
        Bilet bilet=new Bilet();
        this.cod= bilet.cod;
        this.echipaA= bilet.echipaA;
        this. echipaB=bilet.echipaB;
        this.data=bilet.data;

        return bilet;
    }
}
