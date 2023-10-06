package com.siam.web_automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SecondAutomation extends BaseDriver1 {
String url = "https://www.selenium.dev/downloads/";
	
	//method for opening this url	
	@Test
	public void openUrl() throws InterruptedException {
		driverr.manage().window().maximize();
		driverr.get(url);
		Thread.sleep(10000); // 1000 = 1s
		
		driverr.findElement(By.xpath("//span[contains(text(),'Blog')]")).click(); //finding element and click
		Thread.sleep(3000);
		
		driverr.findElement(By.xpath("//span[contains(text(),'Support')]")).click(); //finding element and click
		Thread.sleep(2000);
		
		driverr.findElement(By.xpath("//span[contains(text(),'Documentation')]")).click(); //finding element and click
		Thread.sleep(5000);
		
		driverr.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[4]")).click(); //finding element and click
		Thread.sleep(10000);
	}
	
}
