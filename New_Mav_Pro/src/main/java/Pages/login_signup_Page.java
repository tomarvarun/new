package Pages;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Library.base_library;

public class login_signup_Page extends base_library{
	
	@FindBy(xpath = "//a[@href=\"/login\"]")
	private WebElement login;
	@FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
	private WebElement name;
	@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
	private WebElement email;
	@FindBy(xpath = "//*[text()='Signup']")
	private WebElement signup;
	@FindBy(xpath = "//input[@value=\"Mr\"]")
	private WebElement mr;
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement password;
	@FindBy(xpath = "//select[@id=\"days\"]")
	private WebElement day;
	@FindBy(xpath = "//select[@id=\"months\"]")
	private WebElement month;
	@FindBy(xpath = "//select[@id=\"years\"]")
	private WebElement year;
	@FindBy(xpath = "//div[@class=\"checkbox\"]")
	private WebElement checkbox;
	@FindBy(xpath = "//input[@name=\"optin\"]")
	private WebElement checkboxtwo;
	@FindBy(xpath = "//input[@id=\"first_name\"]")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name=\"last_name\"]")
	private WebElement lastname;
	@FindBy(xpath = "//input[@id=\"company\"]")
	private WebElement company;
	@FindBy(xpath = "//input[@id=\"address1\"]")
	private WebElement adress;
	@FindBy(xpath = "//select[@name=\"country\"]")
	private WebElement country;
	@FindBy(xpath = "//input[@id=\"state\"]")
	private WebElement state;
	@FindBy(xpath = "//input[@id=\"city\"]")
	private WebElement city;
	@FindBy(xpath = "//input[@id=\"zipcode\"]")
	private WebElement zipcode;
	@FindBy(xpath = "//input[@id=\"mobile_number\"]")
	private WebElement mobilenumber;
	@FindBy(xpath = "//button[@data-qa=\"create-account\"]")
	private WebElement createaccount;
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continu;
	@FindBy(xpath = "//a[@href=\"/delete_account\"]")
	private WebElement deleteaccount;
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement afterdeleteconti;
	
	
	
	
	
	public login_signup_Page() {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonlogin() {
		login.click();
	}
	public void filldetails() {
		name.sendKeys(getReaddata(0, 1, 1));
		//email.sendKeys(getReaddata(0, 1, 0));
		email.sendKeys("aseoisdff@gmail.com");
		signup.click();
		mr.click();
		password.sendKeys(getReaddata(0, 2, 0));
		selectbyindex(day, 19);
		selectbyvisibletext(month, "September");
		selectbyindex(year, 13);
		//checkbox.click();
		
		firstname.sendKeys(getReaddata(0, 1, 1));
		lastname.sendKeys(getReaddata(0, 1, 2));
		 company.sendKeys(getReaddata(0, 1, 3));
		 adress.sendKeys(getReaddata(0, 1, 4));
		 state.sendKeys(getReaddata(0, 1, 5));
		 city.sendKeys(getReaddata(0, 1, 6));
		// zipcode.sendKeys(getReaddata(0, 1, 7));
		 zipcode.sendKeys("201013");
		 //mobilenumber.sendKeys(getReaddata(0, 1, 8));
		 mobilenumber.sendKeys("7668441185");
		 checkboxtwo.click();
		 
		
	}
	public void clickoncreateacc() {
		
//		    if (driver == null) {
//		        throw new IllegalStateException("WebDriver is not initialized.");
//		    }

		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;

		   
		    js.executeScript("arguments[0].scrollIntoView(true);", createaccount);

		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(createaccount));

		    
		    createaccount.click();
		}
	public void clickoncontinue() {
		continu.click();
	}
	public void clickondeleteacc() {
		deleteaccount.click();
	}
	public void clickondelcon() {
		afterdeleteconti.click();
		
	}

	}
	


