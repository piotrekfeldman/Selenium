package dataUtilities;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public FileInputStream fs = new FileInputStream("C:\\Users\\piotr\\MvnExercises\\src\\test\\java\\dataUtilities\\data.properties");
    public Properties pr = new Properties();
    public WebDriver driver;


    public Base() throws FileNotFoundException {
    }


    public WebDriver InitializeDriver() throws IOException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\piotr\\Downloads\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\ChromeDriver\\Nowy Folder\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Users\\piotr\\Downloads\\IEDriverServer.exe");


        pr.load(fs);


        String browser = pr.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ie")) {

            driver = new InternetExplorerDriver();
        }
        return driver;

    }

    public void GetScreenShoot(String result) {


        try {
            File scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File DestFile = new File("C:\\Users\\piotr\\OneDrive\\Desktop\\Nowy folder (4)\\Testcase " + result + new SimpleDateFormat("MM-dd-yyyy_HH-mm").format(new GregorianCalendar().getTime()) + ".png");
            FileUtils.copyFile(scrShot, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Logger  Logs()
    {


        Logger logger = Logger.getLogger(dataUtilities.Base.class);
        PropertyConfigurator.configure("C:\\Users\\piotr\\Testuj.pl\\src\\test\\java\\resources\\log4j.properties");

        //Logger logger = Logger.getLogger(Base.class);

        //DOMConfigurator is used to configure logger from xml configuration file
        //DOMConfigurator.configure("C:\\Users\\piotr\\Testuj.pl\\src\\test\\java\\resources\\log4j2.xml");

        return logger;
    }


}

