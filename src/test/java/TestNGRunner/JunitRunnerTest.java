package TestNGRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "StepDefination", monochrome = true, tags = "@VerifyIssuer or @VerifyISIN", plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:target/reports.html",
		"json:target/reports.json", })
public class JunitRunnerTest {

	
	

}
	
	

