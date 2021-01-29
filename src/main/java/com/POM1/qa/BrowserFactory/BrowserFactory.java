package com.POM1.qa.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BrowserFactory {
	public static WebDriver driver = null;
	
	public WebDriver CreateBrowserInstance(String browsername) 
	{
		
			// Configuring the system properties of chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

			//Initializing the browser driver
			ChromeDriver driver = new ChromeDriver();
	
		return driver;
	}
}