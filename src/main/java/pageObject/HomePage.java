package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	By email= By.cssSelector("input[id='user_email']");
	By signIn= By.cssSelector("input[type='submit']");
	By Message= By.cssSelector("class[type='message']");
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver= driver;
	}
	public WebElement getEmail() 
	{
		return driver.findElement(email);
		
	}
	public WebElement SignIn() 
	{
		return driver.findElement(signIn);
		
	}
	public WebElement getMessage() 
	{
		return driver.findElement(Message);
		
	}
}