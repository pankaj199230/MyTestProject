package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pageobjectmanager;
	public BaseClass baseclass;
	public CommonCode commoncode;
	
	public TestContextSetup() throws IOException {
		
		baseclass=new BaseClass();
		
		pageobjectmanager=new PageObjectManager(baseclass.WebDriverManager());
		commoncode=new CommonCode(baseclass.WebDriverManager());
		
	}

}
