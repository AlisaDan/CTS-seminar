package teste;

import categorii.TestGetPromovabilitate;
import categorii.UrgentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import utilsfortests.StudentStub;

public class GrupaWithStubTest {
    @Category({TestGetPromovabilitate.class, UrgentTest.class})
    @Test
    public void promovabilitateTest(){
        IStudent studentStub=new StudentStub();
        Grupa grupa=new Grupa(1010);
        grupa.adaugaStudent(studentStub);
        Assert.assertEquals(1f,grupa.getPromovabilitate(),0.01);
    }
}
