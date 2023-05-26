package StepDefination;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {

	public TestContextSetup testContextSetup;

	public Hooks(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;
	}

	@After
	public void closebrowser() throws IOException {

		testContextSetup.baseclass.WebDriverManager().quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {

		WebDriver driver = testContextSetup.baseclass.WebDriverManager();

		if (scenario.isFailed()) {

			File Sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] bytefile = FileUtils.readFileToByteArray(Sourcefile);

			scenario.attach(bytefile, "image/png","image");

		}

	}
}