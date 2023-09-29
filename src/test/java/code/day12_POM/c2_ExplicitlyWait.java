package code.day12_POM;

import code.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_ExplicitlyWait {
@Test
    public void TC1_ExplicitlyWait(){
    WebDriverWait driverWait=new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(15));
    DriverUtil.getDriver().get("http://www.google.com");
    //verify google title
    driverWait.until(ExpectedConditions.titleIs("Google"));
    //Send iphone14 pro
    WebElement googleSearchBox=DriverUtil.getDriver().findElement(By.name("q"));
    driverWait.until(ExpectedConditions.elementToBeClickable(googleSearchBox));
    driverWait.until(ExpectedConditions.visibilityOf(googleSearchBox));
    googleSearchBox.sendKeys("iphone 14 pro"+ Keys.ENTER);

      /*
          The Implicit Wait in Selenium is used to tell the web driver to
           wait for a certain amount of time before it throws a "No Such Element Exception".
          The default setting is 0. Once we set the time, the web driver will
          wait for the element for that time before throwing an exception

          //implicitlywait wii be effective for whole code that used
          //explicitlywait will be only for a specific condition,,,,
          //both will
         */

/*
        Explicit Wait
      The Explicit Wait in Selenium is used to tell the Web Driver to wait for
      certain conditions (Expected Conditions) or maximum time exceeded before
      throwing "ElementNotVisibleException" exception.
      It is an intelligent kind of wait, but it can be applied only for specified elements.
      */
}

}
