package ro.ase.cts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.clase.Student;

import java.util.List;

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
    public void getSizeOfListTest(){
        Student student=new Student();
        int nota=8;
        student.adaugaNota(nota);
        Assert.assertEquals(1,student.getNote().size());
    }



}
