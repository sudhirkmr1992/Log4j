package com.app.test;

//import org.testng.ITestListener;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertall  {
	@Test
	public void m1() {
	SoftAssert ast = new SoftAssert();
	System.out.println("assertion checking");
	ast.assertEquals("hello", "hello");
	//ast.assertAll();
  
	}
	@Test
	public void m2() {
	SoftAssert ast = new SoftAssert();
	System.out.println("assertion checking");
	ast.assertEquals("hello", "hi");
	ast.assertAll();
}}
