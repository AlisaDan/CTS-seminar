package teste;

import categorii.NormalTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import utilsfortests.DummyStudent;

public class GrupaWithDummyTest {
    private IStudent student;
    @Before
    public void setUp(){
        student=new DummyStudent();
    }
    @Category(NormalTest.class)
    @Test
    public void adaugaStudentTest(){
        Grupa grupa =new Grupa(1010);
        grupa.adaugaStudent(student);
        Assert.assertEquals(1, grupa.getStudenti().size());
    }
    @Category(NormalTest.class)
    @Test
    public void adaugaStudentiTest(){
        Grupa grupa =new Grupa(1010);
        IStudent student1 = new DummyStudent();
        IStudent student2 = new DummyStudent();

        grupa.adaugaStudent(student);
        grupa.adaugaStudent(student1);
        grupa.adaugaStudent(student2);
        Assert.assertEquals(3, grupa.getStudenti().size());
    }
}
