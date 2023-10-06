package com.siam.web_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver1 {
	WebDriver driverr;
	
	@BeforeSuite
	public void startBrowser() {
		String browserName = System.getProperty("browser", "chrome");
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driverr = new ChromeDriver();		
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driverr = new FirefoxDriver(); 
		}else {
			WebDriverManager.edgedriver().setup();
			driverr = new EdgeDriver();
		}
	}
	
	@AfterSuite
	public void closeBrowser() {
		driverr.close();
	}
}

