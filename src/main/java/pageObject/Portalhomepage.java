package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Portalhomepage {
	public WebDriver driver;
	By searchBox= By.name("qurey");
	
	
	public Portalhomepage(WebDriver driver) 
	{
		this.driver= driver;
	}
	public WebElement getSearchbox() 
	{
		return driver.findElement(searchBox);
		
	}
}
