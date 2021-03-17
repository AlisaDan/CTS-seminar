package ro.ase.cts.readere;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public static final int SIZE_OF_VECTOR = 5;
    private final String fileName;

    public AplicantReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException;

    public void citesteAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int numar = input.nextInt();
        String[] vect = new String[SIZE_OF_VECTOR];
        for (int i = 0; i < numar; i++)
            vect[i] = input.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNumarProiecte(numar, vect);

    }
}
