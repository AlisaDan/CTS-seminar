package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestSetUp.class, GrupaWithStubTest.class, GrupaWithFakeTest.class, GrupaWithDummyTest.class})

public class SuitaCompleta {
}

