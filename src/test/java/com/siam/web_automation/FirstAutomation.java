package com.siam.web_automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{
	String url = "https://www.selenium.dev/downloads/";
	
	//method for opening this url	
	@Test
	public void openUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000); // 1000 = 1s
		
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click(); //finding element and click
		Thread.sleep(10000);
	}
}
