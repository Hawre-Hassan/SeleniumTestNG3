package code.day6_dropdownlist;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_SmartBearTesting {
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
        driver.close();
    }

@Test
    public void TC1_loginVerification(){
    WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
    userName.sendKeys("Tester");
    WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
password.sendKeys("test");
WebElement loginButton= driver.findElement(By.xpath("//input[@type+'submit']"));
loginButton.click();

String ActualTitle= driver.getTitle();
String ExpectedTitle="Web Orders";
    Assert.assertEquals(ActualTitle,ExpectedTitle,"SmartBear title verification has passed");
    }


}
