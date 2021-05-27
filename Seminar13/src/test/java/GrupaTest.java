import org.junit.Assert;
import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTest {


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

    @Test
    public void boundaryPromovabilitateTest() {
        Grupa grupa = new Grupa(1010);
        Assert.assertEquals(0.0f, grupa.getPromovabilitate(), .001f);
    }

    @Test
    public void cardinalityTest() {
        Grupa grupa = new Grupa(1005);
            Student student = new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        Assert.assertEquals(1f, grupa.getPromovabilitate(), .001f);
    }

    
}
