package testSetup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class setupTests {
    public WebDriver driver;
    @Test
    public void testGetPageURl() {
        String pageURL = "https://foodco.ng/user-account/customer-logout/?_wpnonce=731f85aef9";
        if (pageURL.equalsIgnoreCase("https://foodco.ng/user-account/customer-logout/?_wpnonce=731f85aef9")) {
            System.out.println("Account logged out. Page is"+pageURL);
        }else {
            System.out.println("Invalid URL. Actual webpage is"+pageURL);
        }
            }

}
