import org.testng.annotations.*;

public class carLoan {

    @Test(enabled = true)
    public void carLoanLogginForm() {

        System.out.println("carLoanLogginForm");
    }

    @Test(groups = {"Smoke"}, dependsOnMethods = {"carLoanLogginForm"})
    public void carLoanRegisterForm()
    {
        System.out.println("carLoanRegisterForm");


    }
// przed każdym zestawem testów- po prostu na samym począku, używane głównie do sprawdzenia środowiska testowego, danych w środowisku testowym, api keys, czy środowisko się uruchamia
    @BeforeSuite
    public void BeforekSut() {
        System.out.println("Beforek ");
    }


// BeforeTest- przed każydym testem

    @BeforeTest
    public void Beforek()
    {
        System.out.println("Początek testu");


    }

    // przed każdą metodą
    @BeforeMethod
    public void EveryMethod()
    {
        System.out.println("---------TU SIE ZACZYNA METODA------------");


    }


    @AfterMethod
    public void EndOfEveryMethod()
    {
        System.out.println("---------TU SIE kończy METODA------------");


    }

// AfterTest- po każdym teście
    @AfterTest
    public void Afterek()
    {
        System.out.println("Koniec testu");


    }

    @AfterSuite
    public void ThisIsTheEND()
    {
        System.out.println("---------TU SIE KOŃĆZY WSZYSTKO------------");


    }

}
