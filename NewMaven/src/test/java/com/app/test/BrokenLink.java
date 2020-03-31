package com.app.test;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BrokenLink {
	WebDriver driver;
  @Test
  public void f() throws MalformedURLException, IOException {
	List<WebElement> element =  driver.findElements(By.tagName("a"));
	 
	  element.addAll(driver.findElements(By.tagName("img")));
	  System.out.println(element.size());
	  int x = element.size();
	  
	  List<WebElement> element1 = new ArrayList<WebElement>();
	  for(int i =0;i<x;i++) {
		  if(element.get(i).getAttribute("href") != null && (!element.get(i).getAttribute("href").contains("javascript")) ) 
		  {
			  element1.add(element.get(i));
		  }
		 
	  }
	 System.out.println(element1.size());
	 
	
	 
	 for (int j=0; j<element1.size(); j++) {
		 
		 HttpURLConnection check = (HttpURLConnection)new URL(element1.get(j).getAttribute("href")).openConnection();
		 check.connect();
		String s = check.getResponseMessage();
		check.disconnect();
		System.out.println("status message is :- " + element1.get(j).getAttribute("href")+ "---" +s);
	 }	
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("window.size=1400,800");
	  opt.addArguments("headless");
	 driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://spicejet.com/");
  }

}

