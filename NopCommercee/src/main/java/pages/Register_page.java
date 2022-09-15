package pages;

import Browser.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_page {
    WebDriver driver = Browser.driver;
    @FindBy(id = "gender-male") private WebElement gendr;
    @FindBy(id = "FirstName") private  WebElement firstName;
    @FindBy(id = "LastName") private  WebElement lastName;
    @FindBy(css = "select[name='DateOfBirthDay']") private WebElement day;
    @FindBy(css="select[name='DateOfBirthMonth']") private WebElement month;
    @FindBy(css ="select[name='DateOfBirthYear']") private WebElement year;
    @FindBy(id = "Email") private WebElement email;
    @FindBy(id = "Password") private WebElement password;
    @FindBy(id = "ConfirmPassword") WebElement confirmPassword;
    @FindBy(id = "register-button") private  WebElement button;
    @FindBy(id = "a[class='ico-logout']") private WebElement logout;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a") private WebElement continueButton;


    public Login_page getLoginp(){
        gendr.click();
        firstName.sendKeys(Info.firstName);
        lastName.sendKeys(Info.lastName);
        Select select = new Select(day);
        select.selectByVisibleText("11");
        Select select1 = new Select(month);
        select1.selectByVisibleText("May");
        Select select2 = new Select(year);
        select2.selectByVisibleText("1995");
        email.sendKeys(Info.eMail);
        password.sendKeys(Info.password);
        confirmPassword.sendKeys(Info.password);
        button.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        continueButton.click();
        driver.switchTo().defaultContent();
//        driver.switchTo().frame(0);
//        logout.click();


        return PageFactory.initElements(driver,Login_page.class);
    }
}
