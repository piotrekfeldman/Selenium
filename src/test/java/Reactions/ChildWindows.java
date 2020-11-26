package Reactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ChildWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.xpath("//footer/ul/li/a[text()='Warunki']")).click();
        Set<String> allHandles=driver.getWindowHandles();
        Iterator<String> it= allHandles.iterator();
        it.next();
        it.next();



        /*while(allHandles.hasNext())
        {
            driver.switchTo().window(its2.next());
            System.out.println(driver.getTitle());


        }*/


    }
}
