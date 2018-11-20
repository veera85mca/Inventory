package com.pellu.invent.screenshot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.pellu.invent.initialize.Driverinitializer;

public class Generatereports implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		Date da=new Date();
		SimpleDateFormat fordate=new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
		String dat=fordate.format(da);
		String methodname=arg0.getMethod().getMethodName().toString()+dat;
		String errormsg=arg0.getThrowable().toString();
		try {
			String path=Failurescreen.webscreenshot(methodname);
			Failurescreen.failedscreenshot(path, errormsg);
			Driverinitializer.failed_login();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		Failurescreen.skippedcreen(arg0.getMethod().getMethodName().toString());
		Driverinitializer.failed_login();
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		Failurescreen.successscreen(arg0.getMethod().getMethodName().toString());
	}

}
