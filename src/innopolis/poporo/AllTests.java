package innopolis.poporo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EnchantedAccountTest.class, EnchantedPageTest.class,
		StandardAccountTest.class, StandardPageTest.class,
		WallDecoratorTest.class, WallDecoratorInvariantTest.class })
public class AllTests {

}