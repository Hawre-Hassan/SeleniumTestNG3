package code.day9_windowsAndTabs;

import code.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class c2_Windows extends TestBase {
    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on windows
        driver.findElement(By.id("WindowsII")).click();
        //this is store current and only window
        String currentWindow=driver.getWindowHandle();

        System.out.println("current window is="+currentWindow);
        System.out.println("current title is="+ driver.getTitle());


    }


}
