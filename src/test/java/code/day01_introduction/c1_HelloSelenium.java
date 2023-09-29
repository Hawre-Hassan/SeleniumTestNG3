package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c1_HelloSelenium {
    public static void main(String[] args) {
        System.out.println("Hello Selenium");
        //setup chrome driver

        WebDriverManager.edgedriver().setup();
        //create driver instance
        WebDriver driver=new EdgeDriver();
        //navigate to chrome browser
        driver.get("https://www.amazon.com/");
        // go to apple
        driver.get("https://www.apple.com/");


    }

}
