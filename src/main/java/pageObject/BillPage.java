package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillPage {
	
public WebDriver driver;
	
	
	
	
	
	
	public BillPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public WebElement BillID(String ID)
	{
		By BillID= By.cssSelector("input[id='"+ID+"']");
		return (WebElement) BillID;
		
	}
	

	
	


}
