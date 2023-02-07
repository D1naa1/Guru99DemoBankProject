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

    public void AddLoginData(){
        UserID.sendKeys("mngr476670");
        UserPassword.sendKeys("ezaquna");
        LoginBtn.click();
    }
}