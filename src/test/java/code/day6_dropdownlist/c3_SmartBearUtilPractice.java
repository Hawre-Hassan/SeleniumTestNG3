package code.day6_dropdownlist;

import code.utilities.SmartBearLoginUtil;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_SmartBearUtilPractice{
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void closing()throws InterruptedException{
        Thread.sleep(15000);
        driver.close();}

    @Test
    public void TC1_loginSmartBearUtil(){
        SmartBearLoginUtil.loginForSmartBear(driver);
        //verify title equals:web orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"));
    }
}
