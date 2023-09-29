package code.day10_properties;

import code.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_JSpractice extends TestBase {
    @Test
    public void TC1_handlingWindowsWithJsExecutor(){
        driver.get("https://www.youtube.com");
       //we create JSExecutor object and we cast our WebDriver type instance into JSexecutor
        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://honda.com','_blank');");

        Set<String> tabs=driver.getWindowHandles();
        for(String tab:tabs){
            driver.switchTo().window(tab);
            String currentTab=driver.getWindowHandle();
            System.out.println("Current Tab is="+currentTab);
            System.out.println("Title is="+ driver.getTitle());}}

            @Test
                    public void scrollDown(){
                JavascriptExecutor js=(JavascriptExecutor) driver;
                driver.get("http://demo.guru99.com/test/guru99home/");
                js.executeScript("window.scrollBy(0,2000)");
            }
        }





