package Pages;



import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Library.base_library;

public class Contact_us_Page extends base_library {
	public Contact_us_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href=\"/contact_us\"]")
	private WebElement contactus;
	@FindBy(xpath = "//input[@placeholder=\"Name\"]")
	private WebElement name;
	@FindBy(xpath = "//input[@placeholder=\"Email\"]")
	private WebElement email;
	@FindBy(xpath = "//input[@placeholder=\"Subject\"]")
	private WebElement subject;
	@FindBy(xpath = "//textarea[@placeholder=\"Your Message Here\"]")
	private WebElement messege;
	@FindBy(xpath = "//input[@name='upload_file']")
	private WebElement uploadfile;
	@FindBy(xpath = "//input[@value=\"Submit\"]")
	private WebElement submit;
	
	public void clickoncontactus() {
		contactus.click();
	}
	public void senddetails() {
		name.sendKeys(getReaddata(0, 1, 1));
		email.sendKeys(getReaddata(0, 1, 0));
		subject.sendKeys(getReaddata(0, 1, 3));
		messege.sendKeys(getReaddata(0, 1, 4));
	}
	public void uploadfile() throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;

		   
		    js.executeScript("arguments[0].scrollIntoView(true);", uploadfile);

		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(uploadfile)).sendKeys("C:\\Users\\tomar\\eclipse-workspace\\New_Mav_Pro\\test_data\\Book1.xlsx");

		    //uploadfile.click();
		   // uploadfile("C:\\Users\\tomar\\eclipse-workspace\\New_Mav_Pro\\test_data\\Book1.xlsx");
		    //Thread.sleep(2000);
		
		
		
	}
	public void clickonsubmit() {
		submit.click();
		driver.switchTo().alert().accept();
		
	}
	

}
