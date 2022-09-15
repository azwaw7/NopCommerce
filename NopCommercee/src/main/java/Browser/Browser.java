package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        if (Info.browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (Info.browser.equalsIgnoreCase("edge")) {

        }
        return driver;
    }

}
