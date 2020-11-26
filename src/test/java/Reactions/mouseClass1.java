package Reactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseClass1 {

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, 5);
        /*driver.get("http://nba.com");
        w.until(ExpectedConditions.elementToBeClickable(By.className("back_link")));
        driver.findElement(By.className("back_link")).click();
        Thread.sleep(5000);
        driver.manage().window().maximize();

        WebElement pickem=driver.findElement(By.xpath("//button[contains(text(),'Pick')]"));

        a.moveToElement(pickem).click().build().perform();*/

        driver.get("https://www.amazon.com/");
        Actions a=new Actions(driver);
       WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("huge dildo").doubleClick().sendKeys(Keys.ENTER).build().perform();
       // w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a[tabindex='47']"))));
       // WebElement deals=driver.findElement(By.cssSelector("a[tabindex='47']"));
              //  a.moveToElement(deals).contextClick(deals).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
    }
}
