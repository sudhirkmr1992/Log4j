package com.app.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
//import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

//	@Override		
//    public void onFinish(ITestContext arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }		

    public void onStart(ITestContext skg) {					
    System.out.println("Test started----" + skg.getName());			
        		
    }		

//    @Override		
//    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }		

    public void onTestFailure(ITestResult result) {					
    	 System.out.println("Failed Test" + result.getName());				
        		
    }		

    public void onTestSkipped(ITestResult result) {					
       System.out.println("Skiped test" + result.getName());			
        		
    }		

    public void onTestStart(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestSuccess(ITestResult result) {					
    	  System.out.println("success test" + result.getName());			
        		
    }	



}
