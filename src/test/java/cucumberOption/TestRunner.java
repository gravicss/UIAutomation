package cucumberOption;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import stepDefination.Hooks;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature/Login.feature",
		glue="stepDefination")

public class TestRunner extends AbstractTestNGCucumberTests {
	


    private final Hooks testHooks = new Hooks();

    @BeforeClass
    public void setUp() throws IOException {
        testHooks.setUp();
    }

    @AfterClass
    public void tearDown() {
        Reporter.loadXMLConfig(new File("extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
	
	

}
