package Suite.All;

import Suite.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Page3Test extends BaseTest {
    @Test
    @DisplayName("Page 3")
    public void page3Test(){
        openPage.OpenBrowser();
        System.out.println("страница 3 ");
    }
}
