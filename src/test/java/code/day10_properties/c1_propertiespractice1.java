package code.day10_properties;

import code.base.TestBase;
import code.utilities.BrowserUtil;
import code.utilities.PropertiesReadingUtil;
import code.utilities.SmartBearLoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class c1_propertiespractice1 extends TestBase {
    //open chrome browser
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //click on box which belongs "charles Dodgeson"
    //click on delete button
    //verify if charles deleted from the list
    // @Test public void TC1_CharlesDeleteVerification()
    @Test
    public void TC1_CharlesDeleteVerification(){
        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        //login to smartbear
        SmartBearLoginUtil.loginForSmartBear(driver);

        //click on box which belongs "charles Dodgeson"
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();

        //click on delete button
       driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']")).click();
       List<WebElement> listOfAllNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td/[2]"));
for(WebElement eachName:listOfAllNames){
    Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"),"Assertion failed!!");
}

    }

}


