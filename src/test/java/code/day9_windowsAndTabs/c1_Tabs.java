package code.day9_windowsAndTabs;

import code.base.TestBase;
import code.utilities.BrowserUtil;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c1_Tabs extends TestBase {
    @Test
            public void TC1_handlingTabs(){
//oop concept, inheritance method
  driver.get("https://renas-practice.herokuapp.com/home");
  //click on elements
    driver.findElement(By.id("selenium-Elements")).click();
    //click on windows
        driver.findElement(By.id("WindowsII")).click();
    //this is store current and only window
    String currentWindow=driver.getWindowHandle();

    System.out.println("current window is="+currentWindow);
    System.out.println("current title is="+ driver.getTitle());

    //click on new tab"click me" button
   WebElement openNewTabButton=driver.findElement(By.id("open-tab"));
    openNewTabButton.click();
   System.out.println("current title is="+ driver.getTitle());
    Set<String> alltabs=driver.getWindowHandles();
    for(String tab:alltabs){
        driver.switchTo().window(tab);
        BrowserUtil.staticWait(3);
        System.out.println("current title is"+driver.getTitle());
    }
    }
        }