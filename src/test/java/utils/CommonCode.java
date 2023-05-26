package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CommonCode {

	public WebDriver driver;

	public CommonCode(WebDriver driver) {
		this.driver = driver;
	}

	public void switchtochild() {

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String ParentWindow = i1.next();
		String ChildWindow = i1.next();
		driver.switchTo().window(ChildWindow);
	}

}
