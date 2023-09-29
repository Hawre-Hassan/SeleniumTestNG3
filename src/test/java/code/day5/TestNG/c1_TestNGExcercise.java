package code.day5.TestNG;

import org.testng.annotations.*;

public class c1_TestNGExcercise {

    @BeforeClass
    public void setupClass(){System.out.println("before class is running");}

    @AfterClass
    public void afterClass(){System.out.println("before class is running");}

    @BeforeMethod
    public void setup(){System.out.println("Before method is running");}

    @AfterMethod
    public void closing(){System.out.println("After method is running");}

    @Test
    public void TC1() {System.out.println("Test1 is running");}

    @Test
    public void TC2() {System.out.println("Test2 is running");}


}
