package Tests;




import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Library.base_library;
import Pages.login_signup_Page;

public class login_signup_Test extends base_library{
	login_signup_Page ob;
	@BeforeTest
	public void LaunchUrl() throws InterruptedException {
		launchUrl();
		ob=new login_signup_Page();
		
	}
	@Test(priority = 1)
	public void Clickonlogin() {
		ob.clickonlogin();
	}
	@Test(priority = 2)
	public void fillDetails() {
		ob.filldetails();
	}
	@Test(priority = 3)
	public void clicKoncreateacc() {
		
		ob.clickoncreateacc();
	}
	@Test(priority = 4)
	public void clickOncontinue() {
		ob.clickoncontinue();
	}
	@Test(priority = 5)
	public void clickOndelete() {
		ob.clickondeleteacc();
	}
	@Test(priority = 6)
	public void clickOndelcon() {
		ob.clickondelcon();
	}

}
