import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.main_page;


public class mainPage_test extends bastTest {
    @Test
    public void test01(){
        PageFactory.initElements(driver, main_page.class)
                .getDesktopPages()
                .getDigitalStorm().setQuantity("5")
                .addTocart();

    }

}
