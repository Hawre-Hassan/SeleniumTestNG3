package code.day11_AlertAndActionPractice;

import code.base.Testbase2;
import code.utilities.BrowserUtil;
import code.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

   public class c2_Action extends Testbase2 {
        //go to http://demo.guru99.com/test/simple_context_menu.html
        //double click to double click button
        //then accept the alert that pops up

        Actions actions;

        @Test
        public void TC1_doubleClick() {
            DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
            WebElement doubleClickButton = DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
            Actions actions = new Actions(DriverUtil.getDriver());
            //double click to double click button
            actions.doubleClick(doubleClickButton).perform();
            //then accept the alert that pops up
            Alert alert = DriverUtil.getDriver().switchTo().alert();
            BrowserUtil.staticWait(2);
            alert.accept();}

            @Test
            public void TC2_rightClick(){
                //go to http://demo.guru99.com/test/simple_context_menu.html
//right click to right click button
//then click on edit button
//then accept the alert that pops up}
           DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
           WebElement rightClickMeButton=DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
                //right click to right click button
           actions=new Actions(DriverUtil.getDriver());
           actions.contextClick(rightClickMeButton).perform();
                //then click on edit button
                BrowserUtil.staticWait(5);
                DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
                Alert alert=DriverUtil.getDriver().switchTo().alert();
                BrowserUtil.staticWait(3);
                alert.accept();}



               @Test
                        public void TC3_DragAndDrop(){
                   // go to http://demo.guru99.com/test/drag_drop.html

                   DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
            WebElement dragFrom=DriverUtil.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
            WebElement dropTo= DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));

            actions=new Actions(DriverUtil.getDriver());
            actions.dragAndDrop(dragFrom,dropTo).perform();

            WebElement sourceData=DriverUtil.getDriver().findElement(By.id("fourth"));
            WebElement targetBox=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']/li"));
            actions.dragAndDrop(sourceData,targetBox).perform();


            }
        }
    

