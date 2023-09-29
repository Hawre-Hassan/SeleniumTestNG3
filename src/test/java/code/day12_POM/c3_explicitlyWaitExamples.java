package code.day12_POM;

import code.base.Testbase2;
import code.pages.BasePage;
import code.pages.SeleniumPracticeHomePage;
import code.utilities.DriverUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_explicitlyWaitExamples extends Testbase2 {
    //http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    // click on timer
// verify "WebDriver" text present
   @Test
   public void ExplicitlyWaitExampleHomePage(){
        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        SeleniumPracticeHomePage seleniumPracticeHomePage=new SeleniumPracticeHomePage();
        seleniumPracticeHomePage.clickTimerButton();
        seleniumPracticeHomePage.getDefaultText();
        //verify that "WebDriver' text present
        String actualText=seleniumPracticeHomePage.getWebDriverText().getText();
        Assert.assertEquals(actualText,"WebDriver","Web Verification failed");

    }
}
