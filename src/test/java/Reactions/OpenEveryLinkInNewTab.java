package Reactions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class OpenEveryLinkInNewTab{

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");

        //Thread.sleep(3000);
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.filmweb.pl/");
        WindowIterator alu=new WindowIterator();



        Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement foo=wait.until(new Function<WebDriver, WebElement>()
                            {
                                public WebElement apply(WebDriver driver) {
                                    if (driver.findElement(By.className("ws__skipButton")).isDisplayed()) {
                                       return driver.findElement(By.className("ws__skipButton"));
                                    } else {
                                        return null;

                                    }
                                }
                            });
        driver.findElement(By.className("ws__skipButton")).click();

        WebDriverWait w2= new WebDriverWait(driver, 2);
        w2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='rodo__buttons'] button")));
        driver.findElement(By.cssSelector("div[class='rodo__buttons'] button")).click();


             WebElement filmweb= driver.findElement(By.cssSelector("div[id='siteMenuWrapper'] ul"));
             w2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='siteMenuWrapper'] ul")));
        //WebElement section= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(driver.findElements(By.tagName("a")).size());

        System.out.println(filmweb.findElements(By.tagName("a")).size());

        for(int i=1;i<=filmweb.findElements(By.tagName("a")).size();i++)
        {
            String setofkeys=Keys.chord(Keys.CONTROL);
            filmweb.findElements(By.tagName("a")).get(i).click();
        }

    }


}