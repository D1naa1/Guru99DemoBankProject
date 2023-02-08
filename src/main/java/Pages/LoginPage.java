package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement UserID;
    @FindBy(xpath = "//input[@type='password']")
    WebElement UserPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement LoginBtn;
    @FindBy(xpath ="//script[@type='text/javascript']")
    public WebElement ErrorMsg ;

    public void AddLoginData(String name,String password){
        UserID.sendKeys(name);
        UserPassword.sendKeys(password);
        LoginBtn.click();
    }
}