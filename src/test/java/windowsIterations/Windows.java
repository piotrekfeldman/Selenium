package windowsIterations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Windows {

    @Test
    public void WindowTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\ChromeDriver\\Nowy Folder\\chromedriver.exe");
        WebDriver d=new ChromeDriver();

        d.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        d.findElement(By.linkText("Warunki")).click();
      Set<String> set =d.getWindowHandles();

     Iterator<String> it=set.iterator();
        String current=it.next();
        String next=it.next();


           d.switchTo().window(current);
        d.switchTo().window(next);
        Thread.sleep(3000);
        d.switchTo().window(current);


        d.quit();


    }

}
