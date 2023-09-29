package code.day5.TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

import java.security.PublicKey;

public class c3_TestNGExample2 {
    @BeforeClass
    public void setupClass(){System.out.println("before class is running");}

    @AfterClass
    public void afterClass(){System.out.println("before class is running");}

    @BeforeMethod
    public void setup(){System.out.println("Before method is running");}

    @AfterMethod
    public void closing() {System.out.println("After method is running");}

    @Test(priority = 3, dependsOnMethods = "TC3")
    public void TC1()
    {System.out.println("test case 1 is running");}
//TC1 depends on TC3, if test fails, TC1 will be skipped.
    @Test(priority = 1)
    public void TC3(){System.out.println("test case 3 is running");
    int age=25;
    int expectedAge=25;
        Assert.assertEquals(age,expectedAge);
        System.out.println("assertion for age has passed");
    }
    @Test(priority = 2)
    public void TC2(){System.out.println("test case 2 is running");
    String color="red";
    String expectedColor="red";
    Assert.assertEquals(color,expectedColor);}

   @Ignore @Test
    public void TC4(){
        System.out.println("test case 4 is running");
    }




}
