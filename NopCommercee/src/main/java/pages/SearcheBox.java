package pages;

import Browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearcheBox {
    WebDriver driver = Browser.driver;
    @FindBy(css = "input[class='search-box-text ui-autocomplete-input']")
    WebElement searchBox;
    @FindBy(xpath = "//*[@id='small-search-box-form']/button") private WebElement searchButton;
    @FindBy(xpath = "//div/div[2]/h2/a") private WebElement leicaCamera;
    @FindBy(css = "button[class='button-1 add-to-cart-button']") private WebElement addToCarrtButton;
    public SearcheBox Searche(String entreYourReasrch){
        driver.switchTo().frame(0);
        searchBox.sendKeys(entreYourReasrch);
        driver.switchTo().defaultContent();
        return this;
    }
    public Shoppingcart getLeicaCamera(){
        driver.switchTo().frame(0);
        searchButton.click();
        leicaCamera.click();
        addToCarrtButton.click();
        driver.switchTo().defaultContent();
        return PageFactory.initElements(driver,Shoppingcart.class);



    }


}
