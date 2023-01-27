package stepDefination;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;
import resources.Base;


public class StepDefination extends Base
{
	  @Given("^Enter user Email ID to create user using (.+) $")
	    public void enter_user_email_id_to_create_user_using(String emailid) throws Throwable {
	        driver= initalizeDriver();
	        HomePage hp = new HomePage(driver);
	        hp.getEmail().sendKeys(emailid);
	    }

	    @When("^Click on create user button with $")
	    public void click_on_create_user_button_with() throws Throwable {
	    	 driver= initalizeDriver();
		        HomePage hp = new HomePage(driver);
		        hp.SignIn().click();
	    }

	    @Then("^Proper (.+) should be displayed$")
	    public void proper_should_be_displayed(String message) throws Throwable {
	        driver= initalizeDriver();
	        HomePage hp = new HomePage(driver);
	       String output= hp.getMessage().getText();
	       Assert.assertEquals(output, message);
	    }


	
}
	
	
