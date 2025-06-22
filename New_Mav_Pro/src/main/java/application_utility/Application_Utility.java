package application_utility;

import org.openqa.selenium.WebElement;

public interface Application_Utility {
	public void selectbyvisibletext(WebElement ele,String text);
	public void selectbyindex(WebElement ele,int index);
	public void uploadfile(String file);
	public void scrolldown(WebElement element);
	public void waitutility(WebElement element);
	public void waitutilitybytext(String text);

}
