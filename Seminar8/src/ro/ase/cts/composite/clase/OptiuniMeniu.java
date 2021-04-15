package ro.ase.cts.composite.clase;

public interface OptiuniMeniu {
    void adaugaNod(OptiuniMeniu optiuniMeniu) throws Exception;

    void stergeNod(OptiuniMeniu optiuniMeniu);

    OptiuniMeniu getNod(int index);

    void descriere();
}
