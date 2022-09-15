package pages;

import Browser.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class payment {
    WebDriver driver = Browser.driver;
    @FindBy(css = "button[class='button-1 shipping-method-next-step-button']") private WebElement
    continnueButton;
    @FindBy(id = "paymentmethod_1") private WebElement creditCardCheckBox;
    @FindBy(css = "button[class='button-1 payment-method-next-step-button']") private WebElement
            conToMethodPaymentB;
    @FindBy(css = "select[class='dropdownlists']") private WebElement slectCard;
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
    public void makePayment(){
        driver.switchTo().frame(0);
        Select select = new Select(slectCard);
        select.selectByVisibleText("visa");
        Select select1 = new Select(slectMonth);
        select1.selectByVisibleText("6");
        Select select2 = new Select(selectYear);
        cardholderName.sendKeys(Info.CardNumber);
        cardholderName.sendKeys(Info.firstName+Info.lastName);
        cardCode.sendKeys(Info.CardCode);
        confirmButton.click();

    }


}
