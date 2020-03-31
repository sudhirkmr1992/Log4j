package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {
  @Test(groups ="1")
  public void f() {
	  System.out.println("print f");
  }
  @Test(groups = "1")
  public void f1() { Assert.assertTrue(false);
  System.out.println("print f1");
 
}
@Test(enabled =false,groups = "1")
public void f2() {
  System.out.println("print f2");
}
@Test(groups = "1")
public void f3() { Assert.assertTrue(false);
  System.out.println("print f3");
 
}
@Test(priority=3,groups = "1")
public void f4() {
  System.out.println("print f4");
}
@Test(priority=1 ,groups="1")
public void f5( ) {
  System.out.println("print f5");
}
@Test(priority=2,groups = "1",dependsOnMethods="f3")
public void f6() {
  System.out.println("print f6");
}
}
