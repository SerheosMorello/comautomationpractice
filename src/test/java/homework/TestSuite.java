package homework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSuite {
@RunWith(Suite.class)
@Suite.SuiteClasses({AccountTest.class, SearchTest.class })
public class JunitTestSuite {
    }

}


