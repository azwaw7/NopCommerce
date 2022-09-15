package pages;

import Browser.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shoppingcart {
    WebDriver driver = Browser.driver;
    @FindBy(css ="span[class='cart-label']") private WebElement shoopingCart;
    @FindBy(id = "checkout") private WebElement checkout;
    @FindBy(id = "termsofservice") private WebElement checkbox;



    public Checkout_page getShoppingCart(){
        driver.switchTo().frame(0);
        shoopingCart.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        checkbox.click();
        checkout.click();
        return PageFactory.initElements(driver,Checkout_page.class);


    }


}
