package pages;

import Browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class main_page {
    WebDriver driver = Browser.driver;
    @FindBy(xpath = "//div[6]/div[2]//a") private WebElement computersLink;
    @FindBy(xpath = "//div[1]/div[2]/ul/li[1]/ul/li[1]/a") private WebElement desktopsLink;
    public Desktops_page getDesktopPages(){
        driver.switchTo().frame(0);
        computersLink.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        desktopsLink.click();
        driver.switchTo().defaultContent();
        final String path = "src/main/java/screenshot";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(path + "test.png");
        try {
            FileUtils.copyFile(screenshot, destFile);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return PageFactory.initElements(driver,Desktops_page.class);

    }
}
