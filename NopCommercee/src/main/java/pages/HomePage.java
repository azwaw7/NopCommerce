package pages;

import Browser.Browser;
import org.openqa.selenium.By;
import pages.Register_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver = Browser.driver;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a") private WebElement options;

    public Register_page getRegister(){
        driver.switchTo().frame(0);
        options.click();
        return PageFactory.initElements(driver,Register_page.class);

    }


}
