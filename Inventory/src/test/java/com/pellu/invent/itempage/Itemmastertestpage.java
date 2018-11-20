package com.pellu.invent.itempage;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.graphbuilder.curve.ShapeMultiPath;
import com.pellu.invent.initialize.Driverinitializer;

public class Itemmastertestpage extends Driverinitializer{

public static SoftAssert asser;
private static String expire;
private static String attri, compon;
private static String[] itemobj, unitobj, quantityobj;

public static void getusername_getpassword()
{
	WebDriverWait wait=new WebDriverWait(driver, 8);
	wait.until(ExpectedConditions.visibilityOf(getmyxpath("Inventory_Loginpage_username")));	
	getmyxpath("Inventory_Loginpage_username").sendKeys(Username);
	getmyxpath("Inventory_Loginpage_password").sendKeys(Password);
	getmyxpath("Inventory_Loginpage_loginbutton").click();
}
public static void clickloginalert()
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(getmyxpath("Inventory_Loginpage_loginalertconfirm")));
	getmyxpath("Inventory_Loginpage_loginalertconfirm").click();
}
public static void logout()
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='dropdown-toggle']")));
	WebDriverWait wait1=new WebDriverWait(driver, 5);
	wait1.until(ExpectedConditions.elementToBeClickable(getmyxpath("Inventory_Loginpage_Logout_logout")));
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", getmyxpath("Inventory_Loginpage_Logout_logout"));
	driver.close();
}
public static void inventory_itemmaster()
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Inventory']/child::span[@class='title']")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", getmyxpath("Inventory_Dashboard_inventorylink"));
	WebDriverWait wait1=new WebDriverWait(driver, 20);
	wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='ITEMMASTER']/child::a[@title='Item master']")));
	WebDriverWait wait2=new WebDriverWait(driver, 20);
	wait2.until(ExpectedConditions.visibilityOf(getmyxpath("Inventory_Dashboard_Itemmasterlink")));
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", getmyxpath("Inventory_Dashboard_Itemmasterlink"));
}
public static void inventory_additem()
{
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='btn_AddDiscount']")));
	WebDriverWait wait1=new WebDriverWait(driver, 15);
	wait1.until(ExpectedConditions.elementToBeClickable(getmyxpath("Inventory_Itemlist_additembutton")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", getmyxpath("Inventory_Itemlist_additembutton"));
}
public static void additem_iteminfo(String Itemname)
{
	WebDriverWait wait=new WebDriverWait(driver, 12);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@name='ITEMTYPE']")));
	WebDriverWait wait1=new WebDriverWait(driver, 12);
	wait1.until(ExpectedConditions.visibilityOfAllElements(getallxpath("Inventory_Additem_iteminfo_radio")));
	List<WebElement> info=getallxpath("Inventory_Additem_iteminfo_radio");
	for(int i=0;i<info.size();i++)
	{
		if(Itemname.equalsIgnoreCase(info.get(i).getAttribute("ogname")))
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", info.get(i));
			break;
		}
	}
}
//general
public static void additem_general_code(String code)
{
	getmyxpath("Inventory_Additem_general_Code").sendKeys(code);
}
public static void additem_general_name(String name)
{
	getmyxpath("Inventory_Additem_general_name").sendKeys(name);
}
public static void additem_general_HSN(String hsn)
{
	getmyxpath("Inventory_Additem_general_HSN").sendKeys(hsn);
}
public static void additem_general_printname(String printname)
{
	getmyxpath("Inventory_Additem_general_Printname").sendKeys(printname);
}
public static void additem_general_chargecategory(String chargecategory)
{
	WebDriverWait wait2=new WebDriverWait(driver, 20);
	wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//select[@id='ddl_ItemChargeID']/option")));
	dropdown(getmyxpath("Inventory_Additem_general_ChargeCategory"), chargecategory);
}
public static void additem_general_form(String form)
{
	dropdown(getmyxpath("Inventory_Additem_general_Form"), form);
}
public static void additem_general_buyunit(String buyunit)
{
	dropdown(getmyxpath("Inventory_Additem_general_BuyingUnit"), buyunit);
}
public static void additem_general_sellunit(String sellunit)
{
	dropdown(getmyxpath("Inventory_Additem_general_SellingUnit"), sellunit);
}
public static void additem_general_converunit(String converunit)
{
	getmyxpath("Inventory_Additem_general_ConversionUnit").sendKeys(converunit);
}
public static void additem_general_prefersupplier(String prefersupplier, String quanity)
{
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(getmyxpath("Inventory_Additem_general_PreferredSupplier")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", getmyxpath("Inventory_Additem_general_PreferredSupplier"));
	WebDriverWait wait2=new WebDriverWait(driver, 20);
	wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='checkboxesMultiSupplier']/table")));
	List<WebElement> tables=driver.findElements(By.xpath("//div[@id='checkboxesMultiSupplier']/table"));
	for(int i=0;i<tables.size();i++)
	{
		WebElement rowhead=tables.get(i).findElement(By.xpath("//*[@id='"+tables.get(i).getAttribute("id")+"']/tbody/tr[1]/th/input"));
		if(prefersupplier.equalsIgnoreCase(rowhead.getAttribute("title")))
		{
			WebElement textbox=tables.get(i).findElement(By.xpath("//*[@id='"+tables.get(i).getAttribute("id")+"']/tbody/tr[2]/td[2]/input[1]"));
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("arguments[0].click();", textbox);
			textbox.sendKeys(quanity);
			break;
		}
	}
}
public static void additem_general_reorderlevel(String reorder)
{
	getmyxpath("Inventory_Additem_general_ReorderLevel").sendKeys(reorder);
}
public static void additem_general_defaultpurchaseqty(String purchaseqty)
{
	getmyxpath("Inventory_Additem_general_DefaultPurchaseQty").sendKeys(purchaseqty);
}

//flags module
public static void additem_flags_BatchEntryMode(String batchentry)
{
	dropdown(getmyxpath("Inventory_Additem_Flags_BatchEntryMode"), batchentry);
}
public static void additem_flags_PricingMode(String price)
{
	dropdown(getmyxpath("Inventory_Additem_Flags_PricingMode"), price);
}
public static void additem_flags_HasAttributes(String Attributes)
{
	attri=Attributes;
	checkbox(getmyxpath("Inventory_Additem_Flags_HasAttributes"), Attributes);
}
public static void additem_flags_ExpiryDate(String Expiry)
{
	expire=Expiry;
	asser=new SoftAssert();
	if("yes".equalsIgnoreCase(Expiry))
	{
		if(!getmyxpath("Inventory_Additem_Flags_ExpiryDate_yes").isSelected())
		{
			asser.fail("Expiry dates yes is not selected as default");
		}
	}else if ("no".equalsIgnoreCase(Expiry)) {
		getmyxpath("Inventory_Additem_Flags_ExpiryDate_no").click();
	}
}
public static void additem_flags_HasComponents(String Components)
{
	compon=Components;
	checkbox(getmyxpath("Inventory_Additem_Flags_HasComponents"), Components);
}
public static void additem_flags_ExpiryFormat(String Expiryformat)
{
	if(expire.equalsIgnoreCase("yes"))
	{
		dropdown(getmyxpath("Inventory_Additem_Flags_ExpiryFormat"), Expiryformat);
	}else if (expire.equalsIgnoreCase("no")) {
			if(getmyxpath("Inventory_Additem_Flags_ExpiryFormat").isEnabled())
			{
				asser.fail("Expiry format field is not disabled");
			}
	}	
}
public static void additem_flags_POGRProcess(String pogrprocess)
{
	checkbox(getmyxpath("Inventory_Additem_Flags_PO/GRProcess"), pogrprocess);
}
public static void additem_flags_IsOTC(String OTC)
{
	checkbox(getmyxpath("Inventory_Additem_Flags_IsOTC"), OTC);
}
public static void additem_flags_IsNarcotic(String Narcotic)
{
	checkbox(getmyxpath("Inventory_Additem_Flags_IsNarcotic"), Narcotic);
}
public static void additem_flags_ScheduleHDrug(String HDrug)
{
	checkbox(getmyxpath("Inventory_Additem_Flags_IsScheduleHDrug"), HDrug);
}

//Frame attributes fields
public static void frame_attribute_frametype(String ftype)
{
	attribute_radio("Inventory_Additem_Frameattribute_Frametype", ftype);
}
public static void frame_attribute_framemetal(String fmetal)
{
	attribute_radio("Inventory_Additem_Frameattribute_Framemetal", fmetal);
}
public static void frame_attribute_framebrand(String fbrand)
{
	attribute_radio("Inventory_Additem_Frameattribute_Framebrand", fbrand);
}
public static void frame_attribute_frameshape(String fshape)
{
attribute_radio("Inventory_Additem_Frameattribute_Frameshape", fshape);
}
public static void frame_attribute_framesize(String kidssize)
{
	attribute_radio("Inventory_Additem_Frameattribute_Framesize", kidssize);
}
//IOL attributes fields
public static void IOL_attribute_ioltype(String IOLtype)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLtype", IOLtype);
}
public static void IOL_attribute_iolmetal(String IOLmetal)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLmetal", IOLmetal);
}
public static void IOL_attribute_iolbrand(String IOLbrand)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLbrand", IOLbrand);
}
public static void IOL_attribute_iolshape(String IOLshape)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLshape", IOLshape);
}
public static void IOL_attribute_iolorientation(String IOLorientation)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLorientation", IOLorientation);
}
public static void IOL_attribute_iolpower(String IOLpower)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLpower", IOLpower);
}
public static void IOL_attribute_ioleye(String IOLeye)
{
	scrollattribute("Inventory_Additem_subcomponents_headertext");
	attribute_radio("Inventory_Additem_IOLattribute_IOLeye", IOLeye);
}
public static void IOL_attribute_iolcolor(String IOLcolor)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLcolor", IOLcolor);
}
public static void IOL_attribute_iolname(String IOLname)
{
	attribute_radio("Inventory_Additem_IOLattribute_IOLname", IOLname);
}
//Spectacle attributes fields
public static void Spectacle_lenstype(String Lenstype)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lenstype", Lenstype);
}
public static void Spectacle_lensmaterial(String Lensmaterial)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lensmaterial", Lensmaterial);
}
public static void Spectacle_lensbrand(String Lensbrand)
{
	scrollattribute("Inventory_Additem_Spectacleattribute_middleelement");
	attribute_radio("Inventory_Additem_Spectacleattribute_lensbrand", Lensbrand);
}
public static void Spectacle_lensmanufacture(String Lensmanufact)
{
	scrollattribute("Inventory_Additem_Spectacleattribute_lastelement");
	attribute_radio("Inventory_Additem_Spectacleattribute_lensmanufacture", Lensmanufact);	
}
public static void Spectacle_lensshape(String Lensshape)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lensshape", Lensshape);
}
public static void Spectacle_lenssize(String Lenssize)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lenssize", Lenssize);
}
public static void Spectacle_lensdiameter(String Lensdiameter)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lensdiameter", Lensdiameter);
}
public static void Spectacle_lenspower(String Lenspower)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lenspower", Lenspower);
}
public static void Spectacle_lenspolarize(String Lenspolarize)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lenspolarize", Lenspolarize);
}
public static void Spectacle_lensphotocramatic(String Lensphoto)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lensphotocramatic", Lensphoto);
}
public static void Spectacle_lenstint(String Lenstint)
{
	attribute_radio("Inventory_Additem_Spectacleattribute_lenstint", Lenstint);
}
//Fixed assets attributes fields
public static void fixedassets_type(String fixedtype)
{
	attribute_radio("Inventory_Additem_Fixedassets_type", fixedtype);
}
public static void fixedassets_brand(String fixedbrand)
{
	attribute_radio("Inventory_Additem_Fixedassets_brand", fixedbrand);
}
public static void fixedassets_color(String fixedcolor)
{
	attribute_radio("Inventory_Additem_Fixedassets_color", fixedcolor);
}
public static void fixedassets_usage(String fixedusage)
{
	attribute_radio("Inventory_Additem_Fixedassets_usage", fixedusage);
}
//Contact lens attributes fields
public static void contactlens_manufacturer(String manufacture)
{
	scrollattribute("Inventory_Additem_contactlens_lastelement");
	attribute_radio("Inventory_Additem_Spectacleattribute_lensmanufacture", manufacture);	
}
public static void contactlens_power(String power)
{
	attribute_radio("Inventory_Additem_contactlens_power", power);
}
public static void contactlens_color(String color)
{
	attribute_radio("Inventory_Additem_contactlens_color", color);
}
public static void contactlens_disposability(String dispose)
{
	attribute_radio("Inventory_Additem_contactlens_disposability", dispose);
}
//Sun Glass attributes fields
public static void sunglass_type(String type)
{
	attribute_radio("Inventory_Additem_sunglass_type", type);
}
public static void sunglass_lensmaterial(String lens)
{
	attribute_radio("Inventory_Additem_sunglass_lensmaterial", lens);
}
public static void sunglass_framematerial(String frame)
{
	attribute_radio("Inventory_Additem_sunglass_framematerial", frame);
}
public static void sunglass_brand(String brand)
{
	attribute_radio("Inventory_Additem_sunglass_brand", brand);
}
public static void sunglass_shape(String shape)
{
	attribute_radio("Inventory_Additem_sunglass_shape", shape);
}
public static void sunglass_size(String size)
{
	attribute_radio("Inventory_Additem_sunglass_size", size);
}
public static void sunglass_color(String color)
{
	scrollattribute("Inventory_Additem_sunglass_lastelement");
	attribute_radio("Inventory_Additem_sunglass_color", color);
}
//Common fields for additem
public static void subcomponents(String Item, String unit, String quantity)
{
	scrollattribute("Inventory_Additem_subcomponents_headertext");
	itemobj=Item.split(",");
	unitobj=unit.split(",");
	quantityobj=quantity.split(",");
	for(int i=5;i<itemobj.length;i++)
	{
		getmyxpath("Inventory_Additem_subcomponents_addplus").click();
	}
	for(int i=0;i<itemobj.length;i++)
	{
		for(int j=1;j<=3;j++)
		{
			int k=i+2;
			driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).click();
			if(j==1)
			{
				driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).sendKeys(itemobj[i]);
				driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).sendKeys(Keys.DOWN);
				driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).sendKeys(Keys.ENTER);
			}else if (j==2) {
				driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).sendKeys(unitobj[i]);
				driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).sendKeys(Keys.DOWN);
				driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).sendKeys(Keys.ENTER);
			}else if (j==3) {
				driver.findElement(By.xpath(".//table[@id='product_table']/tbody/tr["+k+"]/td["+j+"]/input[1]")).sendKeys(quantityobj[i]);
			}
		}
	}
}
public static void additem_save()
{
	scrollattribute("Inventory_Additem_Savebutton");
	WebDriverWait wait2=new WebDriverWait(driver, 15);
	wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='Button6']")));
	WebDriverWait wait3=new WebDriverWait(driver, 15);
	wait3.until(ExpectedConditions.elementToBeClickable(getmyxpath("Inventory_Additem_Savebutton")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", getmyxpath("Inventory_Additem_Savebutton"));
	//getmyxpath("Inventory_Additem_Savebutton").click();
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(getmyxpath("Inventory_Additem_save_alertclose")));
	WebDriverWait wait1=new WebDriverWait(driver, 15);
	wait1.until(ExpectedConditions.elementToBeClickable(getmyxpath("Inventory_Additem_save_alertclose")));
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", getmyxpath("Inventory_Additem_save_alertclose"));
	logout();
}


//Return the locators for inventory
public static WebElement getmyxpath(String xpath)
{
	return driver.findElement(By.xpath(prob.getProperty(xpath)));
}
public static List<WebElement> getallxpath(String xpath)
{
	return driver.findElements(By.xpath(prob.getProperty(xpath)));
}
public static void dropdown(WebElement ele, String value)
{
	Select s=new Select(ele);
	s.selectByVisibleText(value);
}
public static void checkbox(WebElement yes, String ans)
{
	if(ans.equalsIgnoreCase("yes"))
	{
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", yes);
	}
}
public static void attribute_radio(String attriname, String value)
{
	List<WebElement> radios=getallxpath(attriname);
	for(int i=0;i<radios.size();i++)
	{
		if(driver.findElement(By.xpath("//label[@for='"+radios.get(i).getAttribute("id")+"']")).getText().equalsIgnoreCase(value))
		{
			WebDriverWait wait=new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(radios.get(i)));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", radios.get(i));
			break;
		}
	}
}
public static void scrollattribute(String scrollele)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", getmyxpath(scrollele));
}
}
