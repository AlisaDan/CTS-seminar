package ro.ase.cts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.fail;

public class StudentTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testConstructorRightName() {
        String nume = "Alisa";
        Student student = new Student(nume);
        Assert.assertEquals(nume, student.getNume());
    }

    @Test
    public void addNotaToListTest() {
        Student student = new Student();
        int nota = 8;
        student.adaugaNota(nota);

        Assert.assertEquals(nota, student.getNota(0));
    }

    @Test
    public void getSizeOfListTest() {
        Student student = new Student();
        int nota = 8;
        student.adaugaNota(nota);

        Assert.assertEquals(1, student.getNote().size());
    }

    @Test
    public void calculeazaMediePentruOSinguraNotaTest() {
        Student student = new Student();
        int nota = 8;
        student.adaugaNota(nota);

        Assert.assertEquals(nota, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void calculeazaMediePentruTreiNoteTest() {
        Student student = new Student();
        int nota1 = 10;
        int nota2 = 9;
        int nota3 = 8;
        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        student.adaugaNota(nota3);
        float medie = (nota1 + nota2 + nota3) / 3f;

        Assert.assertEquals(medie, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void calculeazaMedieFaraNoteTest() {
        Student student = new Student();

        Assert.assertEquals(0, student.calculeazaMedie(), 0.01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getNoteIndexOutOfBoundsExceptionTest() {
        Student student = new Student();
        int nota = 8;
        student.adaugaNota(nota);

        Assert.assertEquals(nota, student.getNota(-1));
    }


    @Test
    public void getNoteIndexOutOfBoundsExceptionTestJunit3() {
        Student student = new Student();
        int nota = 8;
        student.adaugaNota(nota);
        try {
            student.getNota(-1);
            fail("Testul a esuat");
        } catch (IndexOutOfBoundsException ignored) {
        }
    }

    @Test
    public void areRestanteTest(){
        Student student=new Student();
        student.adaugaNota(3);
        student.adaugaNota(5);

        Assert.assertTrue(student.areRestante());
    }

    @Test
    public void nuAreRestanteTest(){
        Student student=new Student();
        student.adaugaNota(6);
        student.adaugaNota(5);

        Assert.assertFalse(student.areRestante());
    }
}
