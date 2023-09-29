package code.day10_properties;

import code.base.Testbase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import com.github.dockerjava.api.model.CpuStatsConfig;
import com.sun.javafx.scene.KeyboardShortcutsHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_diverUtilPractice extends Testbase2 {
    //go to google
    //search for monitor
    //verify title contains hello


    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_URL"));
        WebElement googleSearchBox=DriverUtil.getDriver().findElement(By.name("q"));
        //search for monitor
        String searchItem=PropertiesReadingUtil.getProperties("googleSearchData");
        googleSearchBox.sendKeys(searchItem+Keys.ENTER);

        //verification of title
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
    }

}
