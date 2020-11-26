package dataUtilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import senditTest.SenditPl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import static dataUtilities.Base.driver;

public class Listeners implements ITestListener {

    Base b=new Base();
    driver = b.InitializeDriver();




    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        this.driver = ((SenditPl)result.getInstance()).driver;

        if (!result.isSuccess()) {
            File imageFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String failureImageFileName = result.getMethod().getMethodName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())
                    + ".png";
            File failureImageFile = new File(System.getProperty("user.dir")+"\\screenshots\\"+failureImageFileName);
            File failureImageFile2 = new File("C:\\screen\\"+failureImageFileName);

            //C:\screen\
            FileUtils.copyFile(imageFile, failureImageFile2);
        }

    }

}
