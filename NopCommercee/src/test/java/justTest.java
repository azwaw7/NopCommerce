import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Shoppingcart;

public class justTest extends bastTest{
    @Test
    public void test() throws InterruptedException {
        naviagteToRe().getRegister()
                .getLoginp()
                .login()
                .getDesktopPages()
                .getDigitalStorm()
                .setQuantity("5")
                .addTocart()
                .Searche("camera")
                .getLeicaCamera()
                .getShoppingCart()
                        .checkout()
                                .getPayment();


        Thread.sleep(5000);
    }

}
