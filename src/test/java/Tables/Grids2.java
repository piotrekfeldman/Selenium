package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grids2 {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");

        WebDriver d = new ChromeDriver();
        d.get("https://www.cricbuzz.com/live-cricket-scorecard/22769/nz-vs-eng-4th-t20i-england-tour-of-new-zealand-2019");

        WebElement table = d.findElement(By.cssSelector("div#innings_2 .cb-col.cb-col-100.cb-ltst-wgt-hdr"));

        int count=table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
       int sum=0;



        for(int i=0; i<count-2;i++){
          String competitor=  table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(1)")).get(i).getText();
          String value=  table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
            System.out.println(competitor+" score is "+value+" points ");
            int parsed=Integer.parseInt(value);


        }

        System.out.println(sum);
        d.quit();
    }

}
