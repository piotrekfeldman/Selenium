package dataUtilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Screenshots {

    private ITestResult result;
    private WebDriver driver;

    public  Screenshots(WebDriver driver, ITestResult result) {
        this.result = result;
        this.driver = driver;
    }
public Screenshots(){

}


    public String Czas() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd.HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        return dtf.format(now);
    }

    public void GetScreenShoot(WebDriver driver, String name) throws IOException {


        File scrShot = ((TakesScreenshot) Screen.driver).getScreenshotAs(OutputType.FILE);
        try {
            File DestFile = new File("C:\\Users\\piotr\\Testuj.pl\\src\\test\\data.png");
            FileUtils.copyFile(scrShot, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void GetScreenShoot2(WebDriver driver, String result) throws IOException {


       /* File scrShot = ((TakesScreenshot) Screen.driver).getScreenshotAs(OutputType.FILE);
        try {
            File DestFile = new File("C:\\Users\\piotr\\OneDrive\\Desktop\\Nowy folder (15)\\Nowy folder");
            FileUtils.copyFile(scrShot, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        Screenshots screenshots= new Screenshots();
        String czas = screenshots.Czas();
        System.out.println("czas to "+ czas);
        Date d = new Date();

        String FileName = d.toString().replace(":", "_").replace(" ", "_") + result + ".png";
        String FileName2 = czas.toString().replace(":", "_").replace("/","_").replace(" ", "_") + result + ".png";
        System.out.println("Filename2 "+ FileName2);

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileHandler.copy(screenshot, new File("C:\\screen\\" + FileName2));


        //  WebDriver driver = new FirefoxDriver();
        //  driver.get("http://www.google.com/");
        //   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
        //    FileUtils.copyFile(scrFile, new File("C:\\screen\\s "+Czas()+negatywny+".png"));


    }
}
