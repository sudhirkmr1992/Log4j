package com.app.test;


import org.testng.annotations.Test;

public class PriorityTest {
	 @Test(priority=5 )
	  public void m1() {
		  System.out.println("test1");
	  }
	  @Test()
	  public void m2() {System.out.println("test2");
	  }
	  @Test(priority=3)
	  public void m3(){System.out.println("test3");
	  }
	  @Test(priority=2)
	  public void m4() {System.out.println("test4");
	  }
	  @Test(priority=4)
	  public void m5() {System.out.println("test5");
	  
	  
	  }
}
