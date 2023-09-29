package code.day4_implicitlyWait;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class c1_implicitlyWait {
    public static void main(String[] args) {
        //1.open browser
        //2.go to the page https://wwww.vinexponewyrok.com
        //3.click on attend button

        WebDriver driver= WebDriverUtil.getDriver("chrome");

driver.manage().window().maximize();
driver.get("https://vinexponewyork.com/");
//it is going to wait until page loaded
        //as soon as page loaded it will move to next step
        //
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@href='/attend/']")).click();


    }
}
