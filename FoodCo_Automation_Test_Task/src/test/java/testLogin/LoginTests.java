package testLogin;

import FoodCoObject.DashboardPage;
import FoodCoObject.LoginPage;
import SetUp.SetUps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends SetUps{

   //Check if Popup on Url page for change of location is present
   void PopupImage(){
       String PopupImage=driver.findElement(By.xpath("/html/body/div[6]/div[2]")).getText();
       System.out.println(PopupImage);
   }
    //Check if Towel1 image is present on The subcategories.
    void Towel1test() {
        String Towel1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[1]/a/div/img")).getText();
        System.out.println(Towel1);
    }
    ////Check if Image item  present on Page
    void Towel2test() {
        String Towel2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[1]/a/div/img")).getText();
        System.out.println(Towel2);

    }
    //Check if Image item  present on Page
    void Towel3test() {
        String Towel3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[1]/a/div/img")).getText();
        System.out.println(Towel3);

    }
        @Test
        public void testLogin()throws InterruptedException{
  //driver.get("https://foodco.ng/");
LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
            loginPage.LagosButton();
            Thread.sleep(1000);
            loginPage.clickMyAccount();
            loginPage.enterUsername("mtes7272");
            loginPage.enterPassword("MOUNTAIN12test");
            loginPage.clickLogin();

            DashboardPage dashboardPage = PageFactory.initElements(driver,DashboardPage.class);
            dashboardPage.clickHOUSEHOLD();
            dashboardPage.clickBathAndBed();

            dashboardPage.verifyTowel1();
            dashboardPage.verifyTowel2();
            dashboardPage.verifyTowel3();
            dashboardPage.clickLogout();
            dashboardPage.clickConfirmAndLogout();

        }


      }


