package Reactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class WindowIterator {
    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sendit.pl/");
        Thread.sleep(2000);
        Set<String> st=driver.getWindowHandles();


        WebElement cennik=driver.findElement(By.xpath("//span[contains(text(),\"Cennik\")]"));
       driver.manage().window().maximize();

        Actions a1=new Actions(driver);
        String setkeys=Keys.chord(Keys.DOWN);
        a1.contextClick(cennik).build().perform();

       Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);

        Set<String> allHandles=driver.getWindowHandles();
        Iterator<String> it= allHandles.iterator();
        it.next();
        it.next();




      /*  while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
*/



               // sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
//sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().
    }

}