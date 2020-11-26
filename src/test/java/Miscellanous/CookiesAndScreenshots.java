package Miscellanous;

import anagramy.Anagram;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

@Test
public class CookiesAndScreenshots {



    public void Screen() throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\piotr\\Downloads\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://onet.pl");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\piotr\\OneDrive\\Desktop\\Nowy folder (4)\\scredfsdfen.png"));

    }




}