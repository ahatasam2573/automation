package com.siam.web_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
		
	WebDriver driver;
	
	@BeforeSuite
	public void startBrowser() {
			String browserName = System.getProperty("browser","chrome"); //checking system e chrome browser ache kina
			
			if(browserName.equals("chrome")) {
				
				WebDriverManager.chromedriver().setup(); // setup 
				driver = new ChromeDriver(); //instance create 
				
			}else if(browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();	
				
			}else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();			
			}
	}
	
	@AfterSuite
	public void close() {
		driver.close();
	}
		
}
