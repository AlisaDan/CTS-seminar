package teste;

import categorii.NormalTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTestSetUp {
    private Grupa grupa;

    @Before
    public void setUp() {
        grupa = new Grupa(1005);

        for (int i = 1; i < 11; i++) {
            Student student = new Student();
            student.adaugaNota(i % 10 + 1);
            grupa.adaugaStudent(student);
        }
    }
    @Test(timeout = 100)
    public void performancePormovabilitateTest() {

        grupa.getPromovabilitate();
    }
}
