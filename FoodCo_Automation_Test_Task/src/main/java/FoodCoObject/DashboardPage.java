package FoodCoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }


    private By HOUSEHOLD=By.xpath("//*[@id=\"nav-menu-item-3339\"]/a");
    //locate HOUSEHOLD Text element and click
    public void clickHOUSEHOLD()throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(HOUSEHOLD).click();

    }
    private By BathAndBed =By.className("thumb-info-wrapper");
    //locate HomeAppliance on  HouseHold page and click
    public void clickBathAndBed()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(BathAndBed).click();
    }
    private By Towel1 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[1]/a/div/img");
    //locate first Towel Element and verify if Displayed
    public void verifyTowel1(){
        driver.findElement(Towel1).isDisplayed();
    }
    private By Towel2 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[1]/a/div/img");
    //locate first Towel Element and verify if Displayed
    public void verifyTowel2(){
        driver.findElement(Towel2).isDisplayed();
    }
    private By Towel3 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[1]/a/div/img");
    //locate first Towel Element and verify if Displayed
    public void verifyTowel3(){
        driver.findElement(Towel3).isDisplayed();
    }
    //Locating The Logout element on Dashboard Using By
    private By Logout =By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");
    //locate the logout element and click
    public void clickLogout()throws InterruptedException{
        driver.findElement(Logout).click();
    }
    //A confirmation for Logging Out is sent to The User at this Point
    //Initiate Action,At this point the User is Logged out finally from the Website
    private By ConfirmAndLogout =By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");
    //locate confirm and Logout Element and click
    public void clickConfirmAndLogout()throws InterruptedException{
     //Wait for 5secs Before Executing
     Thread.sleep(2000);
        driver.findElement(ConfirmAndLogout).click();
    }




}
