package FoodCoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
  //Locate the popup Message and verify.
private By PopupImage =By.xpath("/html/body/div[6]/div[2]");
    public void verifyPopupImage(){
        driver.findElement(PopupImage).isDisplayed();

    }

    //locate Elements on DashboardPage Using By
    private By LagosButton =By.xpath("/html/body/div[6]/div[2]/div[1]/form/label[2]");
    public void LagosButton(){
        //locate lagos button element on delivery pop up and click
        driver.findElement(LagosButton).click();
    }
//locate login Element MyAccount Using By
    private By MyAccount =By.xpath("//*[@id=\"nav-menu-item-20267\"]/a");
    public void clickMyAccount(){
        driver.findElement(MyAccount).click();

    }
 //using By locate username field and enter username
 private By username =By.id("username");
 public void enterUsername(String uName){
   //find and enter Username
   driver.findElement(username).sendKeys(uName);
 }
 private By password=By.id("password");
 public void enterPassword(String pwd){
//locate password element and enter Password
driver.findElement(password).sendKeys(pwd);
 }
 //locate the login Button using @FindBy
    private By Login =By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button");
 public DashboardPage clickLogin(){
     driver.findElement(Login).click();
     return new DashboardPage(driver);
 }


}
