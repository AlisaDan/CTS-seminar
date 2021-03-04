package ro.ase.cts.readere;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class AplicantReader {
    private String fileName;

    public AplicantReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException,NumberFormatException;
}
