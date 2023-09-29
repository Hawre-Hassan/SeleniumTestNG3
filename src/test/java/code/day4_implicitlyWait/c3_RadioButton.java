package code.day4_implicitlyWait;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c3_RadioButton {
//verify to navigate https://courses.letskodeit.com/practice
//click on BMW RADIO button
//verify that is selected
public static void main(String[] args) throws InterruptedException {
    WebDriver driver= WebDriverUtil.getDriver("chrome");
    driver.get("https://courses.letskodeit.com/practice");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//click on BMW radio button
    WebElement BMWRadio= driver.findElement(By.id("bmwradio"));
    BMWRadio.click();
Thread.sleep(3000);
    //verify that is selected
    boolean BMWRadioselected=BMWRadio.isSelected();
if(BMWRadioselected){
    System.out.println("BMW is selected and verification has passed");}
else{System.out.println("BMW is selected and verification has failed");}

//verify Honda is not selected
    WebElement HondaRadio= driver.findElement(By.xpath("//input@id='hondaradio]"));
if(!HondaRadio.isSelected()){
    System.out.println("Honda is not selected and verification has passed");}
    else {
    System.out.println("Honda is not selected and verification has failed");
    driver.close();
}

}
}
