package code.day4_implicitlyWait;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c2_CheckBox {
    public static void main(String[] args) {

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        //2.Got https://demo.guru99.com/test/radio.html
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        //3.verify checkbox1 is not selected
        WebElement CheckBox1=driver.findElement(By.id("vfb-6-0"));
        if(!CheckBox1.isSelected()){
            System.out.println("CheckBox1 is not selected, verification has passed");}
        else {
            System.out.println("CheckBox1 is not selected, verification has failed");}
//4 click checkbox2
        WebElement CheckBox2=driver.findElement(By.id("vfb-6-1"));
        CheckBox2.click();
        if(CheckBox2.isSelected()){
            System.out.println("CheckBox2 verification has passed");}
        else {System.out.println("CheckBox2 verification has failed");}

        driver.quit();

    }
}
