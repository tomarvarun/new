package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Library.base_library;
import Pages.Home_Page_Varification_Page;

public class Home_Page_Varification_Test extends base_library {
	Home_Page_Varification_Page ob;
	@BeforeTest
	public void LaunchUrl() throws InterruptedException {
		launchUrl();
		ob=new Home_Page_Varification_Page();
	}
	@Test(priority = 1)
	public void Clickonhomepage() {
		ob.clickonhomepage();
	}
	@Test(priority = 2)
	public void clickontestCase() {
		ob.clikontestcase();
	}
	

}
