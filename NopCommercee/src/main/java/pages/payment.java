package pages;

import Browser.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class payment {
    WebDriver driver = Browser.driver;
    @FindBy(css = "button[class='button-1 shipping-method-next-step-button']") private WebElement
    continnueButton;
    @FindBy(id = "paymentmethod_1") private WebElement creditCardCheckBox;
    @FindBy(css = "button[class='button-1 payment-method-next-step-button']") private WebElement
            conToMethodPaymentB;
    @FindBy(id = "CreditCardType") private WebElement slectCard;
    @FindBy(id = "CardholderName") private WebElement cardholderName;
    @FindBy(id = "ExpireMonth") private WebElement slectMonth;
    @FindBy(id = "CardNumber") private WebElement CardNumber;
    @FindBy(id = "ExpireYear") private WebElement selectYear;
    @FindBy(id = "CardCode") private WebElement cardCode;
    @FindBy(css = "button[class='button-1 payment-info-next-step-button']") private
    WebElement confirmButton;

    public payment getPayment(){
        continnueButton.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        creditCardCheckBox.click();
        conToMethodPaymentB.click();
        driver.switchTo().defaultContent();

        return this;
    }
    public payment makePayment(){
       // driver.switchTo().frame(0);
        Select select = new Select(slectCard);
        select.selectByVisibleText("Visa");
        Select select1 = new Select(slectMonth);
        select1.selectByVisibleText("6");
        Select select2 = new Select(selectYear);
        select2.selectByVisibleText("2026");
        cardholderName.sendKeys(Info.CardNumber);
        cardholderName.sendKeys(Info.firstName+Info.lastName);
        cardCode.sendKeys(Info.CardCode);
        confirmButton.click();
        return this;


    }


}
