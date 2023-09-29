package code.day8_iframeAndNegativetest;

import code.utilities.SmartBearLoginUtil;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_WebTablePractice {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");}

        @Test(dataProvider = "TestDataForStreetName")
                public void TC1_StreetVerification(String streetName){
            SmartBearLoginUtil.loginForSmartBear(driver);
            SmartBearLoginUtil.verifyStreet(driver,streetName);
    }

    @DataProvider(name="TestDataForStreetName")
    public static Object[][] test(){
        return new Object[][]{
                {"167 sands street 11201 Brooklyn NY"},
                {"20 madison"},
                {"4548 dufferin street"},
                {"1018 Finch Ave W"},
                {"3, Garden st."},

        };
    }}



