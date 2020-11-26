package JSExecutor;

import dataUtilities.Base;
//import dataUtilities.Screen;
import dataUtilities.Screen;
import dataUtilities.Screenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {

    public ITestResult result;

Base b = new Base();
    WebDriver driver = b.InitializeDriver();

    Screenshots screenshots = new Screenshots(driver, result);

    public JavaScriptExecutor() throws IOException {
    }

    @Test
    public void Login() throws IOException, InterruptedException {
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/V4/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.name("btnLogin"));

        //Login to Guru99
        driver.findElement(By.name("uid")).sendKeys("mngr259658");
        driver.findElement(By.name("password")).sendKeys("rygumUr");
        Thread.sleep(2000L);

        screenshots.GetScreenShoot2(driver, "skurrwysyny");

        js.executeScript("arguments[0].click();", button);



        js.executeScript("alert('Elo skurwysyny');");
        Thread.sleep(2000L);

        driver.switchTo().alert().accept();


    }

    @Test
    public void Login2() throws IOException, InterruptedException {


        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launching the Site.
        driver.get("http://moneyboats.com/");

        //Maximize window
        Thread.sleep(4000);
        //Vertical scroll down by 600  pixels
        js.executeScript("window.scrollBy(0,600)");
    }


    @Test
    public void Login3() {


        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launching the Site.
        driver.get("http://demo.guru99.com/V4/");


        //Set the Script Timeout to 20 seconds
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

        //Declare and set the start time
        long start_time = System.currentTimeMillis();

        //Call executeAsyncScript() method to wait for 5 seconds
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

        //Get the difference (currentTime - startTime)  of times.
        System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));

    }


}
