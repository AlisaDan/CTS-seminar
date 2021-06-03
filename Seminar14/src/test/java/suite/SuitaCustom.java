package suite;

import categorii.NormalTest;
import categorii.TestGetPromovabilitate;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.*;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestSetUp.class, GrupaWithStubTest.class, GrupaWithFakeTest.class, GrupaWithDummyTest.class})
@Categories.IncludeCategory(TestGetPromovabilitate.class)
@Categories.ExcludeCategory(NormalTest.class)
public class SuitaCustom {
}
