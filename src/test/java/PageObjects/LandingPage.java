package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By popup = By.xpath("//img[@class='close-first-pop']");

	public void ClosePopup() {
		driver.findElement(popup).click();

	}

}
