package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Library.base_library;
import Pages.Contact_us_Page;

public class Contactus_Test extends base_library {
	Contact_us_Page ob;
	@BeforeTest
	public void LaunchUrl() throws InterruptedException {
		launchUrl();
		ob=new Contact_us_Page();
		
	}
	@Test(priority = 1)
	public void Clickoncontactus() {
		ob.clickoncontactus();
	}
	@Test(priority = 2)
	public void clickonFilldetails() {
		ob.senddetails();
	}
	
	@Test(priority = 3)
	public void Clickonupload() throws InterruptedException {
		ob.uploadfile();
	}
	@Test(priority = 4)
	public void Clickonsubmit() {
		ob.clickonsubmit();		
	}

}
