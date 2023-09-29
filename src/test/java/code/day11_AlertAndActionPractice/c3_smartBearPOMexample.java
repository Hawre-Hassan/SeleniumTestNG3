package code.day11_AlertAndActionPractice;

import code.base.Testbase2;
import code.pages.SmartBearLoginPage;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c3_smartBearPOMexample extends Testbase2 {

    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username")
                ,PropertiesReadingUtil.getProperties("SmartBear_password="));
    }

}



