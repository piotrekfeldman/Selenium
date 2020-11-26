package senditTest;

import dataUtilities.Base;
import dataUtilities.PageObjectRepo;
import dataUtilities.Screen;
import dataUtilities.Screenshots;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class SenditPl extends Base {
    public ITestResult result;

    Logger logger = Logs();
    public WebDriver driver = InitializeDriver();
    Screenshots s = new Screenshots(driver, result);


    public SenditPl() throws IOException {
    }

    @BeforeTest
    public void OpenBrowser() throws IOException, InterruptedException {
        BasicConfigurator.configure();  // linijka wymagana aby uruchomić loggera

        //Base b=new Base();
        //b.Logs().debug();
        logger.info("Driver initialized");
        driver.get("https://sendit.pl/");
        logger.info("Page is open");
        logger.info("Landing Sendit page is open");
        Thread.sleep(3000);
    }

    @Test
    public void Zaloguj() throws IOException, InterruptedException {

        PageObjectRepo p = new PageObjectRepo(driver);
        p.Zaloguj().click();

        p.Username().sendKeys(pr.getProperty("username"));
        p.Password().sendKeys(pr.getProperty("password"));
        p.Submit().click();
        Thread.sleep(3000);
        Date date = new Date();
        try {
            //   Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Moje przesy')]")).isDisplayed());
            Assert.assertEquals((driver.findElement(By.xpath("//span[contains(text(),'Moje przesy')]")).isDisplayed()), true);
            logger.info("Użytkownik zalogowany na stronie");
            s.GetScreenShoot2(driver, "pozytywny");

            Thread.sleep(3000);
        } catch (NoSuchElementException e) {
            s.GetScreenShoot2(driver, " rezultat_negatywny");
            String errormsg = driver.findElement(By.xpath("//li[contains(text(),'d autoryzacji.')]")).getText();
            logger.error("Wystąpił następujący błąd: " + errormsg);

            //  Assert.assertFalse(driver.findElement(By.xpath("//li[contains(text(),'d autoryzacji.')]")).isDisplayed());
            Assert.assertEquals((driver.findElement(By.xpath("//li[contains(text(),'d autoryzacji.')]")).isDisplayed()), false);
        }
    }
        @AfterTest
        public void Shutdown () {


            driver.quit();
        }

    }
