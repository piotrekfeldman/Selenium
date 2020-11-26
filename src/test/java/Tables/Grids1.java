package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Grids1 {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");

        WebDriver d = new ChromeDriver();
        d.get("https://www.cricbuzz.com/live-cricket-scorecard/22769/nz-vs-eng-4th-t20i-england-tour-of-new-zealand-2019");

        WebElement table = d.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));


        int sum=0;

        int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        System.out.println("Liczba indeksów wynosi "+ count);

       //div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)

        for(int i=0;i<count-2;i++)
        {
            String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int parsed=Integer.parseInt(value);
            sum=sum+parsed;
        }

       String extras=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
        int parsedExtras=Integer.parseInt(extras);

        int total=sum+parsedExtras;
        System.out.println(total);
        String extraValue=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();

        int match=Integer.parseInt(extraValue);
        Assert.assertEquals(total,match);




    }
}
