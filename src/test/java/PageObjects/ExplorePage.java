package PageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ExplorePage {

	public WebDriver driver;

	public ExplorePage(WebDriver driver) {
		this.driver = driver;
	}

	By ExploreLink = By.xpath("//a[@title='Explore Bonds in India']");
	By Searchbox = By.xpath("//input[@id='mySearchInputDesktop']");
	By itemlist = By.xpath("//div[@class='autocomplete-items']/div");
	// By SearchButton = By.xpath("//button[@type='submit']");

	public void ExploreClick() {

		String newtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(ExploreLink).sendKeys(newtab);
	}

	public void verifytitle() throws InterruptedException {
		String ActualTitle = driver.getTitle();
		String ExpectedTtle = "List of Bonds - Discover Bonds in the Market | IndiaBonds";
		org.junit.Assert.assertEquals(ActualTitle, ExpectedTtle);
		System.out.println("title has been verified");
		Thread.sleep(5000);
		driver.findElement(By.id("cookieAcceptBtn")).click();
		Thread.sleep(5000);

	}

	public void searchissuer(String issuername) throws InterruptedException {
		String Expected=issuername;
		driver.findElement(Searchbox).click();
		driver.findElement(Searchbox).sendKeys(issuername);
		Thread.sleep(5000);
		List<WebElement> auto = driver.findElements(itemlist);
		int count = auto.size();
		for (WebElement option : auto) {
			System.out.println(option);
			String Actual = option.getText();
			if (option.getText().equals(issuername)) {	
				System.out.println("Selected Issuername is: " + issuername);
				option.click();

				// Thread.sleep(5000);
				// driver.findElement(SearchButton).click();
				Thread.sleep(10000);
				break;
			} else
			{
				Assert.assertEquals(Expected, Actual);
				System.out.println("correct issuer searched");
			}
		}

	}

	public void searchisin(String isin) throws InterruptedException {
		driver.findElement(Searchbox).click();
		driver.findElement(Searchbox).sendKeys(isin);
		Thread.sleep(5000);
		List<WebElement> auto = driver.findElements(itemlist);
		for (WebElement option : auto) {
			if (option.getText().contains(isin))
				;
			option.click();
			Thread.sleep(10000);
			break;

		}
	}

}
