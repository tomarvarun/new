package Pages;

import java.lang.classfile.instruction.DiscontinuedInstruction.JsrInstruction;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base_Library.base_library;

public class AddProductsToCart_Page extends base_library
{
public AddProductsToCart_Page() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[text()=' Products']")
private WebElement products;
@FindBy(xpath = "//a[text()='Add to cart' and @data-product-id=\"2\"][1]")
private WebElement addproduct1;
@FindBy(xpath = "//button[text()='Continue Shopping']")
private WebElement continueshopping;
@FindBy(xpath = "//a[@data-product-id=\"23\"][1]")
private WebElement addproduct2;
@FindBy(xpath = "//u[text()='View Cart']")
private WebElement viewcart;
@FindBy(xpath = "//a[text()=\"Proceed To Checkout\"]")
private WebElement checkout;
@FindBy(xpath = "//u[text()='Register / Login']")
private WebElement loginpage;
@FindBy(xpath = "//button[@class=\"disabled\"][1]")
private WebElement varification;
@FindBy(xpath = "//p[@class=\"cart_total_price\"][1]")
private WebElement varification2;
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
@FindBy(xpath = "//a[@href=\"/view_cart\"][1]")
private WebElement cart;
@FindBy(xpath = "//a[text()='Proceed To Checkout']")
private WebElement finalcheckout;
@FindBy(xpath = "//a[text()='Place Order']")
private WebElement placeorder;
@FindBy(xpath = "//input[@name=\"name_on_card\"]")
private WebElement nameoncard;
@FindBy(xpath = "//input[@name=\"card_number\"]")
private WebElement cardnumber;
@FindBy(xpath = "//input[@placeholder=\"ex. 311\"]")
private WebElement placeholder;
@FindBy(xpath = "//input[@name=\"expiry_month\"]")
private WebElement expiremonth;
@FindBy(xpath = "//input[@placeholder=\"YYYY\"]")
private WebElement expireyear;
@FindBy(xpath = "//button[text()='Pay and Confirm Order']")
private WebElement payandconfirm;



public void clickonproduct() {
	products.click();
}
public void clickonaddproduct1() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;

	   
    js.executeScript("arguments[0].scrollIntoView(true);", addproduct1);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(addproduct1));
	Actions act=new Actions(driver);
	act.moveToElement(addproduct1).click().perform();
	
	
	
}
public void clickonContinueShopping() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(continueshopping));

	continueshopping.click();
}
public void clickonaddproduct2() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;

	   
    js.executeScript("arguments[0].scrollIntoView(true);", addproduct2);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(addproduct2));
	Actions act=new Actions(driver);
	act.moveToElement(addproduct2).click().perform();
}
public void clickonviewcart() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(viewcart));

	viewcart.click();
	String actual=varification.getText();
	String expected="1";
	Assert.assertEquals(actual, expected);
	String actual1=varification2.getText();
	String expected1="Rs. 400";
	Assert.assertEquals(actual1, expected1);
	
}
public void clickoncheckout() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(checkout));
	checkout.click();
}
public void clickonloginpage() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(loginpage));
	loginpage.click();
}
public void filldetails() {
	name.sendKeys(getReaddata(0, 1, 1));
	//email.sendKeys(getReaddata(0, 1, 0));
	email.sendKeys("taghoagh@gmail.com");
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
	
//	    if (driver == null) {
//	        throw new IllegalStateException("WebDriver is not initialized.");
//	    }

	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	   
	    js.executeScript("arguments[0].scrollIntoView(true);", createaccount);

	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(createaccount));

	    
	    createaccount.click();
	}
public void clickoncontinue() {
	continu.click();
}
public void clickoncart() {
	cart.click();
}
public void clickonfinalcheckout() {
	JavascriptExecutor js = (JavascriptExecutor) driver;

	   
    js.executeScript("arguments[0].scrollIntoView(true);", finalcheckout);

    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(finalcheckout));
	finalcheckout.click();
}
public void clickonplaceorder() {
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	   
    js.executeScript("arguments[0].scrollIntoView(true);", placeorder);

    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(placeorder));
	placeorder.click();
}
public void filldetails2() {
	nameoncard.sendKeys("Varun Tomar");
	cardnumber.sendKeys("123456789");
	placeholder.sendKeys("125");
	expiremonth.sendKeys("12");
	expireyear.sendKeys("2025");
}

public void clickonpayandconfirm() {
	payandconfirm.click();
}
}
