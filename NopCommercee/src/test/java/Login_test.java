import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Login_page;

public class Login_test extends bastTest{
    @Test
    public void test01(){
        naviagteToRe()
                .getRegister()
                .getLoginp()
                .login();
    }
}
