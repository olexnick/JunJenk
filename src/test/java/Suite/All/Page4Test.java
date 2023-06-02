package Suite.All;

import Suite.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Page4Test extends BaseTest {
    @Test
    @DisplayName("Page 4")
    public void page4Test(){
        System.out.println("страница 4 ");
        closePage.closeBrowser();
    }
}
