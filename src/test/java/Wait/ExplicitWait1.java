package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExplicitWait1 {

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        // WebDriver Explicit Wait:
        WebDriverWait w = new WebDriverWait(driver,5);


        //Implicit Wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        Thread.sleep(3000);

        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]")));
        driver.findElement(By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Promo code')]")));
        System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Promo code')]")).getAttribute("class"));



        //*[contains(text(),'PROCEED TO CHECKOUT')]



    }

    public static  void addItems(WebDriver driver,String[] itemsNeeded)

    {


        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++)

        {

            //Brocolli - 1 Kg

            //Brocolli,    1 kg

            String[] name=products.get(i).getText().split("-");

            String formattedName=name[0].trim();

            //format it to get actual vegetable name

            //convert array into array list for easy search

            //  check whether name you extracted is present in arrayList or not-

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if(itemsNeededList.contains(formattedName))

            {
                int j=0;

                j++;

                //click on Add to cart

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if(j==itemsNeeded.length)

                {

                    break;

                }

            }

        }

    }

}
