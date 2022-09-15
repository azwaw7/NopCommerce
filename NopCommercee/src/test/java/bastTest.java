import Browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Browser.Info;
import pages.HomePage;

import java.time.Duration;

public class bastTest {
    WebDriver driver = Browser.getDriver();

    @BeforeMethod
    public void setup(){
        driver.navigate().to(Info.Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
//    @AfterMethod
//    public void closBrowser (){
//        driver.close();
//
//
//    }
    public HomePage naviagteToRe(){
        return PageFactory.initElements(driver,HomePage.class);
    }
}
