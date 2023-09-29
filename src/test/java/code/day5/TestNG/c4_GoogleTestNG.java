package code.day5.TestNG;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_GoogleTestNG {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
    //go to google homepage
    driver= WebDriverUtil.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.google.com");}
    //verify google title
    //search for red wine
    @Test
    public void TC1_GoogleTitleVerification(){
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("redwine",Keys.ENTER);

        //verify that title contains wine
        String actualTitle= driver.getTitle();
        String expectedTitle="wine";
        boolean myBoolean=actualTitle.contains(expectedTitle);
        //message in assertion will print out if only assertion fails
        Assert.assertTrue(myBoolean, "assertion failed, title not contained wine");}

    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
