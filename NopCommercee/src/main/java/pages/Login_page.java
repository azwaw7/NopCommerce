package pages;

import Browser.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
    WebDriver  driver = Browser.driver;
    @FindBy(css = "a[class='ico-login']") private  WebElement loginLink;
    @FindBy(id = "Email") private WebElement loginEmail;
    @FindBy(id = "Password") private WebElement loginPassword;
    @FindBy(css = "button[class='button-1 login-button']") private WebElement button;
    @FindBy(css = "a[class='ico-logout']") private WebElement logout;


    public main_page login(){
        driver.switchTo().frame(0);
        logout.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        loginLink.click();
        loginEmail.sendKeys(Info.eMail);
        loginPassword.sendKeys(Info.password);
        button.click();
        driver.switchTo().defaultContent();
//        driver.switchTo().frame(0);
//        loginLink.click();
//        loginEmail.sendKeys(Info.eMail);
//        loginPassword.sendKeys(Info.password);
//        button.click();

        return PageFactory.initElements(driver,main_page.class);
    }


}
