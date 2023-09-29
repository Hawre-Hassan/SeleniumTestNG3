package code.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearLoginUtil {
    public static void loginForSmartBear(WebDriver driver) {
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }

    public static void negativeLoginForSmartBear(WebDriver driver, String userID, String passwordID) {
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys(userID);
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(passwordID);
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }


    public static void verifyStreet(WebDriver driver, String streetName) {
        //to locate all table//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]
        //to locate 5th row //table[@id='ctl00_MainContent_orderGrid']//tr[5]
        // to locate all table rows
        //to locate all street
        List<WebElement> streetList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));

        for (WebElement eachStreet:streetList){
            if (eachStreet.getText().equals(streetName)){
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;}
            }
            Assert.fail("Street name:" + streetName + "is not present on the table");
        }
    }


