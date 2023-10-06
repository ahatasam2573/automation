package com.siam.web_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples {
	
	@Test(priority = 1)
	public void testExample() {
		System.out.println("Test started1");
	}
	
	@Test (priority = 0)
	public void testExample2() {
		System.out.println("Test started2");
	}
	
	@BeforeSuite
	public void beforeSuiteExample() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuiteExample() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTestExample() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTestExample() {
		System.out.println("After test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
}



















