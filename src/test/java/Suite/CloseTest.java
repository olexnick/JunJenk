package Suite;

//import org.junit.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CloseTest extends BaseTest{

    @Test
    @DisplayName("😱")
    public void closeBrowser(){
        closePage.closePage();
        System.out.println("закрываем браузер");
    }
}
