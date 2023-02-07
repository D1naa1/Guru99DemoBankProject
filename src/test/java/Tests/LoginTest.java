package Tests;

import Pages.LoginPage;
import Pages.ManagerPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest{
    public LoginPage LogiObject ;
@Test
    public void Login (){
        LogiObject=new LoginPage(driver);
    ManagerPage ManageObject = new ManagerPage(driver);
        LogiObject.AddLoginData();
    softAssert.assertEquals("Welcome To Manager's Page of Guru99 Bank",ManageObject.MsgAfterLogin.getText());
    }
}
