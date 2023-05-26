package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		/*
		 * if (driver == null) { driver = new ChromeDriver(); String username =
		 * "ib_web_admin"; String password = "aWJfd2ViX2FkbWlu"; String url = "https://"
		 * + username + ":" + password + "@" + "qa-www.indiabonds.com"; driver.get(url);
		 * driver.manage().window().maximize();
		 * 
		 * } return driver; }
		 */

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test/Properties//Global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String url = prop.getProperty("url"); // String
		String browser_prop = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		String browsername = browser_maven!=null ? browser_maven : browser_prop;
		
		String url1 = "https://" + username + ":" + password + "@" + url;

		if (driver == null) {

			if (browsername.equalsIgnoreCase("chrome")) {
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");

				driver = new ChromeDriver(options);
			}
			
			driver.get(url1);
			driver.manage().window().maximize();
		}
		return driver;

		

	}

}
