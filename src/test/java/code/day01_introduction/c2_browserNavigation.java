package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_browserNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //to maximize browser page
        driver.manage().window().maximize();
        //go to google
        driver.get("https://www.google.com/");
        //to get title
        System.out.println("Title is:"+driver.getTitle());
        driver.get("https://www.etsy.com/");
        System.out.println("Title is:"+driver.getTitle());
        //to get current URL
        System.out.println("Current URL:" +driver.getCurrentUrl());
        //we use static wait to wait until given time
        Thread.sleep(5000);
driver.get("https://www.ford.com/");
    }
}
