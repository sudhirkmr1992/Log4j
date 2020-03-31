package com.app.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
	
  @Test
  @Parameters({"a1","b1"})
  public void f(int a,int b) {
	  System.out.println("sum of two number"+ a+b );
  }
  @Test
  @Parameters("name1")
  public void f1(String name) {
	  System.out.println("my name is:-" + name);
  }
  @Test
  @Parameters("browser")
  public void f2(String Browser) {
	  System.out.println("browser name:-" + Browser);
  }
}
