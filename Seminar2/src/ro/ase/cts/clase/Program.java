package ro.ase.cts.clase;

import ro.ase.cts.readere.AplicantReader;
import ro.ase.cts.readere.ElevReader;
import ro.ase.cts.readere.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static List<Aplicant> citesteAplicanti(AplicantReader aplicantReader) throws NumberFormatException, FileNotFoundException {
        return aplicantReader.citesteAplicanti();
    }

    public static void main(String[] args) {
        System.out.println("Suma finantare pentru student: " + Student.getSumaFinantare());
        System.out.println("Suma finantare pentru elev: " + Elev.getSumaFinantare());
        System.out.println("Suma finantare pentru angajat: " + Angajat.getSumaFinantare());
        List<Aplicant> listaAplicanti;
        AplicantReader aplicantReader = new ElevReader("elevi.txt");
        try {
            listaAplicanti = citesteAplicanti(aplicantReader);
            Proiect proiect=new Proiect(80);
            for (Aplicant angajat : listaAplicanti) {
                System.out.println(angajat.toString());
                angajat.afiseazaStatus(proiect);
                System.out.println(angajat.getSumaFinantaree());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
