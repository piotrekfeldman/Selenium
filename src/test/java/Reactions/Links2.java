package Reactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Links2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qaclickacademy.com/practice.php");
        WebElement discountC = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
        discountC.findElements(By.tagName("a"));
        System.out.println(discountC.findElements(By.tagName("a")).size());

        for(int i=1;i<discountC.findElements(By.tagName("a")).size();i++) {
            String setkeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
            discountC.findElements(By.tagName("a")).get(i).sendKeys(setkeys);
            Thread.sleep(5000);
        }
            Set<String> ids = driver.getWindowHandles();
            Iterator<String> its = ids.iterator();

            while(its.hasNext())
            {
                driver.switchTo().window(its.next());
                System.out.println(driver.getTitle());
            }


        }


    }

