package pages;

import Browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import pages.Register_page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.List;

public class HomePage {
    WebDriver driver = Browser.driver;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a") private WebElement options;

    public Register_page getRegister(){
        driver.switchTo().frame(0);
        options.click();
        final String path = "src/main/java/screenshot";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(path + "test.png");
        try {
            FileUtils.copyFile(screenshot, destFile);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return PageFactory.initElements(driver,Register_page.class);


    }


}
