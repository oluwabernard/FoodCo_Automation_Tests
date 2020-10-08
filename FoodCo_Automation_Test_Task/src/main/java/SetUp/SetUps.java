package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import FoodCoObject.LoginPage;

import java.util.concurrent.TimeUnit;

public class SetUps<driver> {
    //Create a WebDriver Object
    protected WebDriver driver;
    //create LoginPage object for the Project
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        //selenium driver created, which would be used by Chrome
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //instantiate Webdriver Object
        driver = new ChromeDriver();
        //maximize project Page Url
        driver.manage().window().maximize();
        //Get page Url and launch
        driver.get("https://foodco.ng/");
        //Project wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Instantiate project login page after Launching the browser- Handle
        loginPage = new LoginPage(driver);

    }
    //what would happen After test is being carried out
    @AfterTest
            public void closeBrowser(){
        //Browser would be closed.
         driver.quit();
    }


}
