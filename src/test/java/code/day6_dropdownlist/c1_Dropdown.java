package code.day6_dropdownlist;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_Dropdown {
    //open chrome browser
    //go to "https://the-internet.herokuapp.com/"
    //click on dropdown
    //confirm default selected dropdown list"please select an option"
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
    }
   @Test
    public void TC1_DropdownVerification(){
        //click on dropdown
        driver.findElement(By.xpath("//a[.='Dropdown']")).click();
        WebElement DropDownBox=driver.findElement(By.id("dropdown"));
        //using select method when there is a select tagName
        Select dropdown=new Select(DropDownBox);
        String defaultOption=dropdown.getFirstSelectedOption().getText();
        String expectDefaultoption="please select an option";
       Assert.assertEquals(defaultOption,expectDefaultoption, "rtrtrt");}}
