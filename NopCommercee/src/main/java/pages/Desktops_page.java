package pages;

import Browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.io.File;
import java.util.List;

public class Desktops_page {
    WebDriver driver= Browser.driver;
    @FindBy(css = "h2[class='product-title']>a") private List<WebElement> computers;
    @FindBy(css = "input[class='qty-input']") private WebElement quantity;
    @FindBy(css = "div[class='product-price']>span") private WebElement digitalStormPcPrice;
    @FindBy(css = "button[class='button-1 add-to-cart-button']") private WebElement addToCarrtButton;



    public Desktops_page getDigitalStorm(){
        driver.switchTo().frame(0);
        computers.get(1).click();
        driver.switchTo().defaultContent();
        return this;
    }

    public Desktops_page setQuantity(String enteredQuantity ) {
        driver.switchTo().frame(0);
        quantity.clear();
        quantity.sendKeys(enteredQuantity);
        driver.switchTo().defaultContent();
        return this;
    }
//    public Desktops_page checkPcPrice(String price){
//        Boolean isThePrice = false;
//        Assertion assertion = new Assertion();
//        driver.switchTo().frame(0);
//        if (digitalStormPcPrice.getText().equals(price)){
//            isThePrice = true;
//            assertion.assertTrue(isThePrice);
//
//        }
//        driver.switchTo().defaultContent();
//        return this;
//
//    }
    public SearcheBox addTocart(){
        driver.switchTo().frame(0);
        addToCarrtButton.click();
        driver.switchTo().defaultContent();
        final String path = "src/main/java/screenshot";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(path + "test.png");
        try {
            FileUtils.copyFile(screenshot, destFile);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return PageFactory.initElements(driver,SearcheBox.class);
    }

}
