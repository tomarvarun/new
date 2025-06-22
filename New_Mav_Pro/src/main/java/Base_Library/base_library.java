package Base_Library;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import application_utility.Application_Utility;
import application_utility.excel_utility;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;


public class base_library implements Application_Utility,excel_utility {
    public static WebDriver driver;
    public static FileReader fr;
    public static Properties pr;

    public void launchUrl() throws InterruptedException {
        // Initialize WebDriver and navigate to the URL
    	

        driver = new ChromeDriver(); // Example initialization, adjust as needed
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
        
        


        
    }
    public void propertiesfiles() throws IOException {
    	pr= new Properties();
    	FileReader fr= new FileReader(System.getProperty("user.dir")+"\\configure\\config.properties");
    	pr.load(fr);
    	
    }

	@Override
	public void selectbyvisibletext(WebElement ele, String text) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
		
	}

	@Override
	public void selectbyindex(WebElement ele, int index) {
		Select sel=new Select(ele);
		sel.selectByIndex(index);
		
	}

	@Override
	public String getReaddata(int sht, int row, int col) {
		String val="";
		String path="C:\\Users\\tomar\\eclipse-workspace\\New_Mav_Pro\\test_data\\Book1.xlsx";
		try {
			FileInputStream fis= new FileInputStream(path);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(sht);
			val=sheet.getRow(row).getCell(col).getStringCellValue();
			 
			
		} catch (Exception e) {
			System.out.println("error in excel utility" + e);
		}
		return val;
	}

	@Override
	public void uploadfile(String file) {
		try {
			StringSelection str=new StringSelection(file);
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(str, str);;
			
			Robot rob=new Robot();
			rob.delay(500);
			rob.keyPress(KeyEvent.VK_CONTROL);
			
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.delay(500);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.delay(500);
			rob.keyRelease(KeyEvent.VK_ENTER);
			
			
		} catch (Exception e) {
			System.out.println("error in robot class" +e);
		}
		
	}

	@Override
	public void scrolldown(WebElement element) {
		
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", element);
		

		
	}

	@Override
	public void waitutility(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

	@Override
	public void waitutilitybytext(String text) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(text)));
		
	}

	

	 

	
}

