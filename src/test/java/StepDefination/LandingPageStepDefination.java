package StepDefination;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.LandingPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	// public WebDriver driver;
	TestContextSetup testContextSetup;
	LandingPage landingpage;

	public LandingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Given("User lands to indiabonds website")
	public void user_lands_to_indiabonds_website() throws InterruptedException {
	/*	testContextSetup.driver = new ChromeDriver();
		String username = "ib_web_admin";
		String password = "aWJfd2ViX2FkbWlu";
		String url = "https://" + username + ":" + password + "@" + "qa-www.indiabonds.com";
		testContextSetup.driver.get(url);
		testContextSetup.driver.manage().window().maximize();*/

	}

	@When("he close the popups")
	public void he_close_the_popups() throws InterruptedException {
		Thread.sleep(5000);

		// PageObjectManager pageobjectmanager = new
		// PageObjectManager(testContextSetup.driver);
		 landingpage = testContextSetup.pageobjectmanager.getLandingPage();
		landingpage.ClosePopup();

	}
}

/*
 * @Then("open explore link on other tab") public void
 * open_explore_link_on_other_tab() throws InterruptedException { String newtab
 * = Keys.chord(Keys.CONTROL, Keys.ENTER);
 * driver.findElement(By.xpath("//a[@title='Explore Bonds in India']")).sendKeys
 * (newtab);
 * 
 * }
 * 
 * @Then("verify the title of Explore page") public void
 * verify_the_title_of_explore_page() throws InterruptedException { Set<String>
 * s1 = driver.getWindowHandles(); Iterator<String> i1 = s1.iterator(); String
 * ParentWindow = i1.next(); String ChildWindow = i1.next();
 * driver.switchTo().window(ChildWindow); String ActualTitle =
 * driver.getTitle(); String ExpectedTtle =
 * "List of Bonds - Discover Bonds in the Market | IndiaBonds";
 * Assert.assertEquals(ActualTitle, ExpectedTtle);
 * System.out.println("title has been verified"); driver.quit();
 * 
 * }
 */
