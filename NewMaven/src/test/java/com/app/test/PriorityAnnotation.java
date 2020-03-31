package com.app.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class PriorityAnnotation {
	@BeforeSuite()
		public void beforesuite() {
		System.out.println("type beforesuite");
	}
	@BeforeTest()
	public void Test() {
	System.out.println("type beforeTest");
}
	@BeforeClass()
	public void beforeclass() {
	System.out.println("type beforeclass");
}
	@BeforeMethod()
	public void beforemethod() {
	System.out.println("type beforemethod");
}
	
  @Test(priority=2)
  public void Testplan() {
	  System.out.println("test plan execute");
  }
  
  @AfterSuite()
	public void aftersuite() {
	System.out.println("type aftersuite");
}
  @AfterMethod()
	public void Aftermethod() {
	System.out.println("type Aftermethod");
}
  @Test(priority=1)
  
	  public void m1() {
		  System.out.println("test 2");  
	  
  }

}
