package Miscellanous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableColumns {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        // String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};


        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        Thread.sleep(2000);
        WebElement sort=driver.findElement(By.cssSelector("tr th:nth-child(2)"));
        while(!sort.findElement(By.cssSelector("th span")).getAttribute("class").contains("sort-direction desc"))
        {
            sort.click();
        }


        List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        ArrayList<String> originalList = new ArrayList<String>();

        for (int i = 0; i < firstColList.size(); i++) {


            originalList.add(firstColList.get(i).getText());

        }
        ArrayList<String> copiedList= new ArrayList<String>();
        Collections.reverse(copiedList);


        for(int j = 0; j < firstColList.size(); j++)
        {
            copiedList.add(originalList.get(j));

        }

       // Collections.sort(copiedList);

        System.out.println("*************Copied list");


        for(String t: copiedList)
        {
            System.out.println(t);
        }
        System.out.println("*******************Original list");

        for(String s: originalList)
        {
            System.out.println(s);
        }

        Assert.assertTrue(originalList.equals(copiedList));


    }
}
