package code.day8_iframeAndNegativetest;

import code.utilities.BrowserUtil;
import code.utilities.SmartBearLoginUtil;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class c1_SmartBearNegativeTest {
    //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- enter incorrect username
//4- enter wrong password
//5- click login button
//6- verify error message displayed :Invalid Login or Password.

    WebDriver driver;
    @BeforeMethod
    public void setUp (){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");}

    @AfterMethod
    public void closing(){
        BrowserUtil.staticWait(20);
        driver.close();
    }
    @Test(dataProvider = "loginCredentials")
    public void TC1Negative(String userID,String passwordID){
        SmartBearLoginUtil.negativeLoginForSmartBear(driver,userID,passwordID);
        WebElement StatusMessage= driver.findElement(By.id("ctl00_MainContent_status"));
    Assert.assertEquals(StatusMessage.getText(),"Invalid Login or Password.");
    }
    //we create a dataprovidor to have small data library
    @DataProvider(name="loginCredentials")
    public static Object[][] invalidusercredentials(){
        return new Object[][]{
                {"Serdar","Kocan"},
                 {"Arion","Kocher88"},
                {"Yaseen","Alsakkaf"},
                {"Hassan","Raman90"},
                {"Seray","BestStudent.11"},
                {"Tester","test"}
    };

    }






}
