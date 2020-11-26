package Reactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.id("travel_date")).click();

        while(!driver.findElement(By.className("datepicker-switch")).getText().contains("April 2021"))
        {
            driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]")).click();

        }

        List<WebElement> dates=driver.findElements(By.cssSelector("td[class*='day']"));
        int count=driver.findElements(By.cssSelector("td[class*='day']")).size();

        System.out.println(driver.findElements(By.cssSelector("td[class*='day']")));

        for(int i=0;i<count;i++)
        {
            String text=dates.get(i).getText();
            if(text.equalsIgnoreCase("8"))
            {
                driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();
                break;
            }
        }

    }

}
