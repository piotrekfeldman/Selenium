package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoSuggestive {



    @Test
    public void UsingJavaScriptExecutor () throws InterruptedException {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\ChromeDriver\\Nowy Folder\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://ksrtc.in/oprs-web/guest/home.do");

       // d.findElement(By.id("fromPlaceName")).click();
        d.findElement(By.id("fromPlaceName")).sendKeys("ban");
        Thread.sleep(3000);

        d.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);

        JavascriptExecutor js = (JavascriptExecutor) d;
        String executor = "return document.getElementById(\"fromPlaceName\").value;";
        String text = (String) js.executeScript(executor);
        System.out.println(text);
       // d.findElement(By.id("fromPlaceName")).click();
       // d.findElement(By.id("fromPlaceName")).sendKeys("BAN");
        int i=0;
        while (!text.equalsIgnoreCase("BANGALORE AIRPORT")) {
            i++;
            d.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(executor);
            System.out.println(text);
            if (text.equalsIgnoreCase("BANGALORE AIRPORT")) {
                System.out.println("Element found");
                d.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
                break;
            }
        }

        Thread.sleep(3000);


        d.findElement(By.id("toPlaceName")).sendKeys("anan");
        Thread.sleep(3000);

        d.findElement(By.id("toPlaceName")).sendKeys(Keys.ARROW_DOWN);

       JavascriptExecutor js2 = (JavascriptExecutor) d;
        String executorTo = "return document.getElementById(\"toPlaceName\").value;";
        String text2 = (String) js2.executeScript(executorTo);
        System.out.println(text2);
        // d.findElement(By.id("fromPlaceName")).click();
        // d.findElement(By.id("fromPlaceName")).sendKeys("BAN");
        int y=0;
        while (!text2.equalsIgnoreCase("ANANTAPUR")) {
            y++;
            d.findElement(By.id("toPlaceName")).sendKeys(Keys.DOWN);
            text2 = (String) js.executeScript(executorTo);
            System.out.println(text);
            if (text2.equalsIgnoreCase("ANANTAPUR")) {
                System.out.println("Element found");
                d.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
                break;
            }
        }




        d.findElement(By.id("txtJourneyDate")).click();

        d.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        d.findElement(By.id("txtReturnJourneyDate")).click();
        d.findElement(By.linkText("27")).click();


        d.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block.btn-booking")).click();


        //class="btn btn-primary btn-lg btn-block btn-booking"
        String title= "KSRTC Official Website for Online Bus Ticket Booking - KSRTC.in";

        Assert.assertEquals(d.getTitle(), title);
        System.out.println(d.getTitle());



    }





//27
        }



