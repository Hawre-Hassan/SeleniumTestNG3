package code.pages;

import code.utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    WebDriverWait driverWait=new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(15));
    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);



    }
}
