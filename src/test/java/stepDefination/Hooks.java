package stepDefination;

import org.testng.Reporter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import resources.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.runner.RunWith;

public class Hooks {
	String URL;
	 @BeforeClass
	    public void setUp() throws IOException {
			Properties prop = new Properties();
			 String currentDirectory = System.getProperty("user.dir");
			 System.out.println(currentDirectory);
			FileInputStream fis = new FileInputStream(currentDirectory+ "src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			URL = prop.getProperty("baseURL");
			Base DriverManager = new Base();
			DriverManager.initalizeDriver().get(URL);
	    }

}
