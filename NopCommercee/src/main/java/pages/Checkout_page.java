package pages;

import Browser.Browser;
import Browser.Info;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class Checkout_page {
    WebDriver driver = Browser.driver;
    @FindBy(id = "BillingNewAddress_City") private WebElement city;
    @FindBy(id = "BillingNewAddress_Address1") private WebElement address;
    @FindBy(id="BillingNewAddress_ZipPostalCode") private WebElement zipCod;
    @FindBy(id="BillingNewAddress_PhoneNumber") private  WebElement phoneNumber;
    @FindBy(css = "button[class='button-1 new-address-next-step-button']") private  WebElement nextButton;
    @FindBy(css = "select[data-trigger='country-select']") private WebElement country;
    @FindBy(css = "select[data-trigger='state-select']") private WebElement state;
    public payment checkout(){
        Select select = new Select(country);
        select.selectByVisibleText("United States");
        Select select1 = new Select(state);
        select1.selectByVisibleText("New York");
        city.sendKeys(Info.City);
        address.sendKeys(Info.Address);
        zipCod.sendKeys(Info.Zipcode);
        phoneNumber.sendKeys(Info.Phonenumber);
        nextButton.click();
        final String path = "src/main/java/screenshot";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(path + "test.png");
        try {
            FileUtils.copyFile(screenshot, destFile);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return PageFactory.initElements(driver,payment.class);
    }
}
