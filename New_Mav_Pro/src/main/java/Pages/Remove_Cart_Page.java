package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Library.base_library;

public class Remove_Cart_Page extends base_library {
	public Remove_Cart_Page() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement products;
	@FindBy(xpath = "//a[text()='Add to cart'and@data-product-id=\"1\"][1]")
	private WebElement addproduct1;

}
