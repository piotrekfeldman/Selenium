package dataUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectRepo {





    private WebDriver driver;

    public PageObjectRepo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


   /* public void  PageObjectRepos(WebDriver driver){


    }*/

 //  By zaloguj=By.xpath();  <<page object model

    // poniżej PageObjectFactory

    @FindBy(xpath = "//span[contains(text(),'ZALOGUJ')]")
    WebElement zaloguj;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;


    @FindBy(className = "btn-default-large")
    WebElement submit;

    public WebElement Submit() {

        return submit;

    }


    public WebElement Zaloguj() {

        return zaloguj;

    }

    public WebElement Username() {

        return username;

    }


    public WebElement Password() {

        return password;

    }


}
