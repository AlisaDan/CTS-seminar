package ro.ase.cts.clase;

import ro.ase.cts.readere.AplicantReader;
import ro.ase.cts.readere.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static List<Aplicant> citesteAplicanti(AplicantReader aplicantReader) throws NumberFormatException, FileNotFoundException {
        return aplicantReader.citesteAplicanti();
    }

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        AplicantReader aplicantReader = new StudentReader("studenti.txt");
        try {
            listaAplicanti = citesteAplicanti(aplicantReader);
            for (Aplicant angajat : listaAplicanti)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
