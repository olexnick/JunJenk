package Suite.All;

import Suite.CloseTest;
import Suite.OpenTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({
        OpenTest.class,
        CloseTest.class,
        OpenTest.class,
        Page1Test.class,
        CloseTest.class,
        SecondOrder.class})
public class FirstOrder {
}
