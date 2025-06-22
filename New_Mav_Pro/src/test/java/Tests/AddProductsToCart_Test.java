package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Library.base_library;
import Pages.AddProductsToCart_Page;

public class AddProductsToCart_Test extends base_library {
	AddProductsToCart_Page ob;
	@BeforeTest
	public void LauchUrl() throws InterruptedException {
		launchUrl();
		ob= new AddProductsToCart_Page();
	}
	@Test(priority = 1)
	public void Clickonproduct() {
		ob.clickonproduct();
	}
	@Test(priority = 2)
	public void clickonProduct1() throws InterruptedException {
		ob.clickonaddproduct1();
	}
	@Test(priority = 3)
	public void clickoncontinue() {
		ob.clickonContinueShopping();
	}
	@Test(priority = 4)
	public void clickonProduct2() throws InterruptedException {
		ob.clickonaddproduct2();
	}
	@Test(priority = 5)
	public void clickonviewcart() {
		ob.clickonviewcart();
	}
	@Test(priority = 6)
	public void Clickoncheckout() {
		ob.clickoncheckout();
	}
	@Test(priority = 7)
	public void Clickonlogin() {
		ob.clickonloginpage();
	}
	@Test(priority = 8)
	public void fillDetails() {
		ob.filldetails();
	}
	@Test(priority = 9)
	public void clicKoncreateacc() {
		
		ob.clickoncreateacc();
	}
	@Test(priority = 10)
	public void clickOncontinue() {
		ob.clickoncontinue();
	}
	@Test(priority = 11)
	public void Clickoncart() {
		ob.clickoncart();
	}
	@Test(priority = 12)
	public void Clickonfinalcheckout() {
		ob.clickoncheckout();
	}
	@Test(priority = 13)
	public void Clickonplaceorder() {
		ob.clickonplaceorder();
	}
	@Test(priority = 14)
	public void ClickonFilldetails1() {
		ob.filldetails2();
	}
	@Test(priority = 15)
	public void Clickonpayandconfirm() {
		ob.clickonpayandconfirm();
	}
	public void clickonthenewpage() {
		
	}
	
	public void newupdate() {
		
	}
	
	public void addnewupdated() {
		
	}
	public void pushnewhead() {
		
	}
	public void newheads() {
		
	}
	public void updated() {
		
	}
}
