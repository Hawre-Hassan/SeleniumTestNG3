package code.day8_iframeAndNegativetest;

import code.utilities.BrowserUtil;
import code.utilities.SmartBearLoginUtil;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_iframe {
    //open a chrome browser
    //go to http://the.internet.herokuapp.com/iframe
    //switching by id or name attribute value

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");
    }
@Test
    public void iframeTest(){
        //send"hello" to message box
    //switching by ID or Name attribute value
    //there are 3 ways to switch iframe;id/name, index and elelment
    driver.switchTo().frame("mce_0_ifr");
    WebElement messageBox=driver.findElement(By.id("tinymce"));
    messageBox.clear();
    messageBox.sendKeys("Hello World");

    //in order to do any action on main html code, you need to main html
    driver.switchTo().defaultContent();
    //in order to return previous iframe, switchTo(). parentFrame();

}

}
