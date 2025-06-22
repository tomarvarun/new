package Tests;




import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Library.base_library;
import Pages.Products_Page;

public class Products_Page_Test extends base_library {
    Products_Page ob;

    @BeforeTest
    public void LaunchUrl() throws InterruptedException {
        launchUrl();
        ob = new Products_Page(driver); // Pass WebDriver instance
        // Use WebDriverWait instead of Thread.sleep
       // WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOf(ob.products));
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void clickOnProducts() throws InterruptedException {
        ob.clickonproducts();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void clickOnmens() throws InterruptedException {
    	ob.clickonmens();
    	Thread.sleep(2000);
    }
}

