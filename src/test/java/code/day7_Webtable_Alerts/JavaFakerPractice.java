package code.day7_Webtable_Alerts;

import code.utilities.SmartBearLoginUtil;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaFakerPractice {
  WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearLoginUtil.loginForSmartBear(driver);
    }
@AfterMethod
public void closing() throws InterruptedException{
        Thread.sleep(90000);
        driver.close();
}

 @Test
        public void TC1_Order() throws InterruptedException {
     WebElement orderLink= driver.findElement(By.xpath("//a[.='Order']"));
orderLink.click();
//select familyAlbum from product. set quantity to 5
     Select dropdown=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
     dropdown.selectByVisibleText("FamilyAlbum");

    WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
    Thread.sleep(5000);
    quantity.sendKeys(Keys.BACK_SPACE);
  quantity.sendKeys("5");



 }}




