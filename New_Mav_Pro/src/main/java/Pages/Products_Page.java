package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Library.base_library;

public class Products_Page extends base_library {
    @FindBy(xpath = "//a[text()=' Products']")
	private WebElement products;
    @FindBy(xpath = "//*[@href=\"/product_details/1\"]")
    private WebElement mens;
    @FindBy(xpath = "//iframe[@style=\"display: none;\" and @name=\"google_esf\"]")
    private WebElement iframe;

    public Products_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickonproducts() {
        products.click();
    }
    public void clickonmens() {
    	driver.switchTo().frame(iframe);
    	mens.click();
    }
}





