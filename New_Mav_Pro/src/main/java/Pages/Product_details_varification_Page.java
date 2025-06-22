package Pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base_Library.base_library;

public class Product_details_varification_Page extends base_library {
	public Product_details_varification_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href=\"/products\"]")
	private WebElement products;
	@FindBy(xpath = "//h2[text()='All Products']")
	private WebElement varifyallproducts;
	@FindBy(xpath = "//p[text()='Men Tshirt'][1]")
	private WebElement varifydetails;
	@FindBy(xpath = "//h2[text()='Rs. 400'][1]")
	private WebElement price;
	@FindBy(xpath = "//input[@id=\"search_product\"]")
	private WebElement search;
	@FindBy(xpath = "//button[@id=\"submit_search\"]")
	private WebElement searchinput;
	@FindBy(xpath = "//p[text()='Pure Cotton V-Neck T-Shirt'][1]")
	private WebElement tshirtverify;
	

	public void verifyhomepage() {
		String actual=driver.getTitle();
		String expected="Automation Exercise";
		Assert.assertEquals(actual, expected);
		waitutilitybytext("Signup / Login");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Signup / Login")));
	}
	public void clickonproducts() {
		products.click();
		String actual=driver.getTitle();
		String expected="Automation Exercise - All Products";
		Assert.assertEquals(actual, expected);
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		   
	    //js.executeScript("arguments[0].scrollIntoView(true);", varifyallproducts);
		scrolldown(varifyallproducts);
		waitutility(varifyallproducts);
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(varifyallproducts));
		String actuals= varifydetails.getText();
		String expecteds="Men Tshirt";
		assertEquals(actuals, expecteds);
		String priceactual=price.getText();
		String priceexpected="Rs. 400";
		assertEquals(priceactual, priceexpected);
		
	}
	public void clickonsearchbox() {
		search.click();
		search.sendKeys("tshirt");
		searchinput.click();
		
	}
	public void verifyvisiblityoftshirt() {
		scrolldown(tshirtverify);
		waitutility(tshirtverify);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", tshirtverify);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(tshirtverify));
	}
}

