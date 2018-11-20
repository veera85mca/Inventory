package com.pellu.invent.screenshot;

import com.pellu.invent.initialize.Driverinitializer;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Failurescreen extends Driverinitializer{

public static String webscreenshot(String path) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des=new File(System.getProperty("user.dir")+"//Itemmasterreports//"+path+".png");
	String imagepath=des.toString();
	FileUtils.copyFile(src, des);
	return imagepath;
}
public static void failedscreenshot(String impath, String error)
{
	log.log(LogStatus.FAIL, error);
	log.log(LogStatus.FAIL, "Test case Failed", log.addScreenCapture(impath));
}
public static void successscreen(String name)
{
	log.log(LogStatus.PASS, "Test case successed", name);
}
public static void skippedcreen(String name)
{
	log.log(LogStatus.SKIP, "Test case skipped", name);
}

}
