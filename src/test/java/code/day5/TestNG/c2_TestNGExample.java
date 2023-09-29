package code.day5.TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

import java.security.PublicKey;

public class c2_TestNGExample {
    @BeforeClass
    public void setupClass(){System.out.println("before class is running");}

    @AfterClass
    public void afterClass(){System.out.println("before class is running");}

    @BeforeMethod
    public void setup(){System.out.println("Before method is running");}

    @AfterMethod
    public void closing() {System.out.println("After method is running");}

    @Test(priority = 3)
    public void TC1(){
        System.out.println("test1 is running");}


    @Test(priority = 1)
    public void TC3(){
        System.out.println("test case 3 is running");
    String ActualName="Jason";
    String ExpectedName="Yassen";
        Assert.assertEquals(ActualName,ExpectedName);
        System.out.println("print ActualName=" + ActualName);}
    //when assertion fails, next line of code is not executed

    @Test(priority = 2)
    public void TC2(){String actualCountry="USA";
    String expectedCountry="USA";
    Assert.assertEquals(actualCountry,expectedCountry);
        System.out.println("actual country="+actualCountry);

    }

}
