package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Library.base_library;
import Pages.Product_details_varification_Page;

public class Product_details_varification_Test extends base_library{
	Product_details_varification_Page ob;
	@BeforeTest
	public void LauchUrl() throws InterruptedException {
		launchUrl();
		ob= new Product_details_varification_Page();
	}
	@Test(priority = 1)
	public void homepagevari() {
		ob.verifyhomepage();
	}
	@Test(priority = 2)
	public void Clickonproduct() {
		ob.clickonproducts();
	}
	@Test(priority = 3)
    public void Clickonsearch() {
		ob.clickonsearchbox();
	}
	@Test(priority = 4)
	public void verifytheproducts() {
		ob.verifyvisiblityoftshirt();
	}
}
