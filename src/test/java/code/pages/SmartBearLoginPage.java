package code.pages;

import code.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import javax.xml.xpath.XPath;

public class SmartBearLoginPage extends  BasePage {

    @FindBy(id="ctl00_MainContent_username")
public WebElement usernameBox;
@FindBy(xpath ="//input[@name='ctl00$MainContent$password']")
public WebElement passwordBox;
@FindBy(id="ctl00_MainContent_login_button")
public WebElement loginButton;

@FindBy(id= "ctl00_mainContent_status")
private  WebElement statusMessage;
//encapsulation method/oop

public void loginSmartBear(String username, String password){
    usernameBox.sendKeys("Tester");
    passwordBox.sendKeys("test");
    loginButton.click();
}
public  String getStatusMessage(){
    return  statusMessage.getText();
}

}
