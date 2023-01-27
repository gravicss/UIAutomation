package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {

	public WebDriver driver;
	public Properties props;
	
	public WebDriver initalizeDriver() throws IOException 
	{
		
		props =new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		props.load(fis);
		
		FileOutputStream  fos =new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		props.store(fos, null);
		
		String browserName = props.getProperty("browser"); 
		
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Rajveer Files\\selenium\\selenium1\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("chromeHeadless"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Rajveer Files\\selenium\\selenium1\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver= new ChromeDriver(options);
		}
		
		else if (browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Rajveer Files\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");

			driver= new FirefoxDriver();
		}
		
		else if (browserName.equals("IE")) 
		{
			System.setProperty("webdriver.ie.driver", "F:\\Rajveer Files\\selenium\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");

			driver= new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
			
	}
	
	public String getScreenShotPath(String TestCaseName, WebDriver driver) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile= System.getProperty("user.dir")+"\\reports\\"+ TestCaseName +".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
		
	}
}
