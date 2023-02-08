package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver ;
    public SoftAssert softAssert ;
    public  Alert alert ;

    @BeforeMethod
    public void DriverSetup (){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
         softAssert = new SoftAssert() ;
        driver.get("https://www.demo.guru99.com/V4/");

            }

            @AfterMethod
    public void QuitDriver (){
        driver.quit();
            }



}
