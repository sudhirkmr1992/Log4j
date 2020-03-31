package com.app.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerClass {
  @Test(priority =1)
  public void Teststart() {
	  System.out.println("hello");
  }
  
  @Test(priority =2)
  public void skip() {
	  System.out.println("hello123");
	  throw new SkipException("error");
  }
  
  @Test(priority =3)
  public void failed() {
	  System.out.println("hello1");
	  Assert.assertTrue(false);
  }
  @Test(priority =4)
  public void pass() {
	  System.out.println("hello12");
	  Assert.assertTrue(true);
  }
}
