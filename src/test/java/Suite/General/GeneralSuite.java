package Suite.General;


import Suite.All.FirstOrder;
import Suite.All.Page3Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

public class GeneralSuite {
    @Suite
    @SelectClasses({
            FirstOrder.class,
            Page3Test.class
    })

    public static class GeneralSuite2 {

        public static void start(){
        }
    }
}
