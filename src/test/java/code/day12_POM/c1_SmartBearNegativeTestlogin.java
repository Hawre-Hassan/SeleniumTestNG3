package code.day12_POM;

import code.base.Testbase2;
import code.pages.SmartBearLoginPage;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_SmartBearNegativeTestlogin extends Testbase2 {
    @Test
    public void TC1_NegativeTest(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("invalidUser"),PropertiesReadingUtil.getProperties("invalidPassword"));
        //verify that we get error message
        String actualErrorMessage=smartBearLoginPage.getStatusMessage();
String expectedErrorMessage="invalid Login or Password.";
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage, "assertion failed, user was able login!!");



        /*public class c1_SmartBearNegativeLogin extends TestBase2 {
            @Test
            public void TC1_NegativeTest(){
                DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
                SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
                smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("invalidUser"),PropertiesReadingUtil.getProperties("InvalidPassword"));

                //verify that we get error message
                String actualErrorMessage=smartBearLoginPage.getStatusMessage();
                String expectedErrorMessage="Invalid Login or Password.";
                Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"assertion failed, user was able login!!");

            }

        }*/
    }
}
