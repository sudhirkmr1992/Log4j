package com.app.test;

import org.testng.SkipException;

import org.testng.annotations.Test;

public class SkipTest {
	
	
  @Test( enabled  = false)
  public void m1() {
	  System.out.println("test1");
  }
  @Test(enabled  = false)
  public void m2() {System.out.println("test2");
  }
  @Test()
  public void m3(){System.out.println("test3");
  }
  @Test()
  public void m4() {System.out.println("test4");
  }
  @Test()
  public void m5() {System.out.println("test5");
  
  throw new SkipException("dfdgg,eded,wwwe");
  }
  
}
