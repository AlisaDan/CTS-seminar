package ro.ase.cts.readere;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader{

    public static final String DELIMITER = ",|\n";

    public ElevReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(DELIMITER);
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Elev elev=new Elev();
            super.citesteAplicant(input,elev);
            int clasa = input.nextInt();
            String tutore = input.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input.close();
        return elevi;
    }
}
