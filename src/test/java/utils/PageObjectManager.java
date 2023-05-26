package utils;

import org.openqa.selenium.WebDriver;

import PageObjects.ExplorePage;
import PageObjects.LandingPage;

public class PageObjectManager {

	public WebDriver driver;
	LandingPage landingpage;
	ExplorePage explorepage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public LandingPage getLandingPage() {

		landingpage = new LandingPage(driver);

		return landingpage;

	}

	public ExplorePage getExplorePage() {

		explorepage = new ExplorePage(driver);

		return explorepage;

	}
}
