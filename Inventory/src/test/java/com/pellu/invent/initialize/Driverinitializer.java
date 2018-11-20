package com.pellu.invent.initialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pellu.invent.itempage.Itemmastertestpage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Driverinitializer {
	
public static WebDriver driver;
public static FileInputStream File;
public static Properties prob;
public static String Username;
public static String Password;
public static ExtentReports report=null;
public static ExtentTest log=null;

public static void startdriver()
{
	//System.out.println(System.getProperty("os.name").toLowerCase());
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driversinitialize/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://192.168.0.199/PellucidClinicsAuto/Home/Index");	
}
public static void getuserpass(String user, String pass) throws IOException
{
File=new FileInputStream(new File(System.getProperty("user.dir")+"/Alllocators/Inventorylocators.properties"));
prob=new Properties();
prob.load(File);
Username=user;
Password=pass;
}

public static void failed_login()
{
	driver.close();
	startdriver();
	Itemmastertestpage.getusername_getpassword();
	Itemmastertestpage.clickloginalert();
	Itemmastertestpage.logout();
}
}
