package code.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPracticeHomePage extends BasePage{
    @FindBy(xpath = "//button[.='Click me to start timer']")
    public WebElement timerButton;
    @FindBy(id = "demo")
    public WebElement DefaultText;
    @FindBy(xpath = "//p[.='WebDriver']")
    public  WebElement WebDriverText;

    public  WebElement getWebDriverText(){
        driverWait.until(ExpectedConditions.visibilityOf(WebDriverText));
        return  WebDriverText;

    }

    public void clickTimerButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();}
    public void getDefaultText(){
        System.out.println("the default text is= "+ DefaultText.getText());
    }
}
