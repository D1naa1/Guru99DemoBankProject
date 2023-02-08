package Tests;

import Pages.LoginPage;
import Pages.ManagerPage;
import javafx.scene.control.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {
    public LoginPage LogiObject;


    @Test(priority = 1)
    public void LoginWithValidData() {
        LogiObject = new LoginPage(driver);
        ManagerPage ManageObject = new ManagerPage(driver);
        LogiObject.AddLoginData("mngr476670", "ezaquna");
        softAssert.assertEquals("Welcome To Manager's Page of Guru99 Bank", ManageObject.MsgAfterLogin.getText());
        System.out.println(ManageObject.MsgAfterLogin.getText());
    }

    @Test(priority = 2)
    public void Login_With_Invalid_ID_Valid_Password() {
        LogiObject = new LoginPage(driver);
        ManagerPage ManageObject = new ManagerPage(driver);
        LogiObject.AddLoginData("mngr", "ezaquna");
        alert = driver.switchTo().alert();
        String AlertMsg = alert.getText();
        softAssert.assertEquals(AlertMsg, "User or Password is not valid");
        alert.accept();
        System.out.println(AlertMsg);
    }

    @Test(priority = 3)
    public void Login_With_Valid_ID_InValid_Password() {
        LogiObject = new LoginPage(driver);
        ManagerPage ManageObject = new ManagerPage(driver);
        LogiObject.AddLoginData("mngr476670", "12345678");
        alert = driver.switchTo().alert();
        String AlertMsg = alert.getText();
        softAssert.assertEquals(AlertMsg, "User or Password is not valid");
        alert.accept();
        System.out.println(AlertMsg);
    }

    @Test(priority = 4)
    public void Login_With_InValid_ID_InValid_Password() {
        LogiObject = new LoginPage(driver);
        ManagerPage ManageObject = new ManagerPage(driver);
        LogiObject.AddLoginData("mngr", "12345678");
        alert = driver.switchTo().alert();
        String AlertMsg = alert.getText();
        softAssert.assertEquals(AlertMsg, "User or Password is not valid");
        alert.accept();
        System.out.println(AlertMsg);
    }
}