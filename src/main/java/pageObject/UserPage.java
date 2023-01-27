package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage {
	
	public WebDriver driver;
	
	 By PayBill= By.cssSelector("a[href*='sign_in']");
	private By AmountAdd = By.cssSelector("div[class='text-center']");
	private By PaymentSource	=By.cssSelector("ul[class='nav navbar-nav navbar-right']") ;
	private By UpdateWallet = By.xpath("//button[text()='UpdateWallet']");
	//WebElement element = driver.findElement(By.id("UserName"));  
	
	
	
	
	public UserPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
//	public WebElement getv() 
//	{
//		return element;
//	}
	
	
	public WebElement getUpdateWallet() 
	{
		return driver.findElement(UpdateWallet);
	}
	
	public WebElement getAmountAdd()  
	{
		return driver.findElement(AmountAdd);
	}
	
	public WebElement getPaymentSource() 
	{
		return driver.findElement(PaymentSource);
	}
	
	

	public BillPage getPayBill() 
	{
		driver.findElement(PayBill).click();
		BillPage lp = new BillPage(driver);
		return lp;
		
	}
	
	
}
