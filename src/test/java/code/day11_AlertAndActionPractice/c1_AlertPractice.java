package code.day11_AlertAndActionPractice;

import code.utilities.BrowserUtil;
import code.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_AlertPractice {

    /* Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
          Enter "hello word" text
         Click okay
         Validate your text appearing on the page */
  @Test
  public void AlertPractice(){
     DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");
      //click JavaScript Alerts
      DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']")).click();
      //Click for Js Prompt
      DriverUtil.getDriver().findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
      //Enter "hello word" text
      Alert alert=DriverUtil.getDriver().switchTo().alert();
      BrowserUtil.staticWait(5);
      alert.sendKeys("Hello World");
      alert.accept();

      WebElement actualText=DriverUtil.getDriver().findElement(By.id("result"));

      Assert.assertTrue(actualText.getText().contains("Hello World"));



  }
}
