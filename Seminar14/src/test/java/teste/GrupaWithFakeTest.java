package teste;

import categorii.NormalTest;
import categorii.TestGetPromovabilitate;
import categorii.UrgentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.Grupa;
import utilsfortests.FakeStudent;

public class GrupaWithFakeTest {
    @Category({NormalTest.class, TestGetPromovabilitate.class})
    @Test
    public void promovabilitateFaraRestanteTest() {
        FakeStudent studentFake = new FakeStudent();
        studentFake.setAreRestanta(false);
        Grupa grupa = new Grupa(1079);
        grupa.adaugaStudent(studentFake);

        Assert.assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Category({UrgentTest.class, TestGetPromovabilitate.class})
    @Test
    public void promovabilitateCuRestanteTest() {
        FakeStudent studentFake = new FakeStudent();
        studentFake.setAreRestanta(true);
        Grupa grupa = new Grupa(1079);
        grupa.adaugaStudent(studentFake);

        Assert.assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

}
