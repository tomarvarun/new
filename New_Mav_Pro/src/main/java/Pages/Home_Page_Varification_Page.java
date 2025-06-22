package Pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base_Library.base_library;

public class Home_Page_Varification_Page extends base_library {
	public Home_Page_Varification_Page() {
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath = "//a[@style=\"color: orange;\"]")
	//private WebElement homepage;
	@FindBy(xpath = "//a[text()=\" Test Cases\"]")
	private WebElement testcase;

	
	public void clickonhomepage() {
		//homepage.click();
		String actual=driver.getTitle();
		String expected="Automation Exercise";
		Assert.assertEquals(actual, expected);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Video Tutorials")));
	}
	public void clikontestcase() {
		testcase.click();
		String actual=driver.getTitle();
		String expected="Automation Practice Website for UI Testing - Test Cases";
		Assert.assertEquals(actual, expected);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Test Case 1: Register User")));
		
	}
}
