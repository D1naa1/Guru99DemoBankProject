package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public String name ;
    public String password ;
    public WebDriver driver;

    public BasePage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
