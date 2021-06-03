package teste;

import categorii.NormalTest;
import categorii.TestGetPromovabilitate;
import categorii.UrgentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTest {

@Category(UrgentTest.class)
    @Test
    public void constructorTest() {
        Grupa grupa = new Grupa(1055);
        Assert.assertEquals(1055, grupa.getNrGrupa());
    }

    @Test
    public void testareLimitaInferioara() {
        Grupa grupa = new Grupa(1000);
        Assert.assertEquals(1000, grupa.getNrGrupa());
    }
    @Category(UrgentTest.class)
    @Test
    public void testareLimitaSuperioara() {
        Grupa grupa = new Grupa(1100);
        Assert.assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void inAfaraLimitelorTest() {
        Grupa grupa = new Grupa(1300);
    }

    @Test(timeout = 1000)
    public void performantaTest() {
        Grupa grupa = new Grupa(1050);
    }
    @Category({NormalTest.class,TestGetPromovabilitate.class})
    @Test
    public void corectitudinePromovabilitateTest() {
        Grupa grupa = new Grupa(1005);
        for (int i = 1; i < 11; i++) {
            Student student = new Student();
            student.adaugaNota(i);
            grupa.adaugaStudent(student);
        }
        Assert.assertEquals(0.6f, grupa.getPromovabilitate(), .001f);
    }
    @Category(NormalTest.class)
    @Test
    public void limitaInferioaraPromovabilitateTest() {
        Grupa grupa = new Grupa(1005);
        for (int i = 1; i < 11; i++) {
            Student student = new Student();
            student.adaugaNota(1);
            grupa.adaugaStudent(student);
        }
        Assert.assertEquals(0.0f, grupa.getPromovabilitate(), .001f);
    }
    @Category(UrgentTest.class)
    @Test
    public void limitaSuperioaraPromovabilitateTest() {
        Grupa grupa = new Grupa(1005);
        for (int i = 1; i < 11; i++) {
            Student student = new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        Assert.assertEquals(1f, grupa.getPromovabilitate(), .001f);
    }
    @Category({NormalTest.class, TestGetPromovabilitate.class})
    @Test
    public void boundaryPromovabilitateTest() {
        Grupa grupa = new Grupa(1010);
        Assert.assertEquals(0.0f, grupa.getPromovabilitate(), .001f);
    }
    @Category({NormalTest.class, TestGetPromovabilitate.class})
    @Test
    public void cardinalityTest() {
        Grupa grupa = new Grupa(1005);
        Student student = new Student();
        student.adaugaNota(10);
        grupa.adaugaStudent(student);
        Assert.assertEquals(1f, grupa.getPromovabilitate(), .001f);
    }


}
