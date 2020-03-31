package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test()
  public void f1() { Assert.assertTrue(false);
	  System.out.println("print f1");
	 
  }
  @Test(dependsOnMethods = "f1")
  public void f2() {
	  System.out.println("print f2");
  }
  @Test()
  public void f3() { Assert.assertTrue(false);
	  System.out.println("print f3");
	 
  }
  @Test()
  public void f4() {
	  System.out.println("print f4");
  }
  @Test()
  public void f5() {
	  System.out.println("print f5");
  }
  @Test()
  public void f6() {
	  System.out.println("print f6");
  }
}
