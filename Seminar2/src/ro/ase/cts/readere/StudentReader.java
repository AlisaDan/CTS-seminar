package ro.ase.cts.readere;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

    public StudentReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> aplicants = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            super.citesteAplicant(input, student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAnStudii(an_studii);
            student.setFacultate(facultate);
            aplicants.add(student);
        }
        input.close();
        return aplicants;
    }

}
