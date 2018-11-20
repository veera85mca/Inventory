package com.pellu.invent.item;

import java.io.IOException;
import java.util.HashMap;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pellu.invent.initialize.Driverinitializer;
import com.pellu.invent.inputreader.Logindata;
import com.pellu.invent.itempage.Itemmastertestpage;
import com.relevantcodes.extentreports.ExtentReports;

public class Itemmastertest extends Driverinitializer{


@Parameters({"Username", "Password"})
@Test(priority=1)
public void invenlogin(String Username, String Password) throws IOException
{
	report=new ExtentReports(System.getProperty("user.dir")+"/Itemmasterreports/Inventoryiteminfo.html");
	getuserpass(Username, Password);
}
@Test(priority=2, dataProvider="frameinfo", dataProviderClass=Logindata.class)
public void frameitem(HashMap<String, String> mapvalue)
{
	log=report.startTest(mapvalue.get("Item info").toString()+" "+mapvalue.get("Code").toString());
	Itemmastercommon(mapvalue);
	if(mapvalue.get("Has Attributes").toString().equalsIgnoreCase("yes"))
	{
	Itemmastertestpage.frame_attribute_frametype(mapvalue.get("FRAME TYPE").toString());
	Itemmastertestpage.frame_attribute_framemetal(mapvalue.get("FRAME METAL").toString());
	Itemmastertestpage.frame_attribute_framebrand(mapvalue.get("FRAME BRAND").toString());
	Itemmastertestpage.frame_attribute_frameshape(mapvalue.get("FRAME SHAPE").toString());
	Itemmastertestpage.frame_attribute_framesize(mapvalue.get("FRAME SIZE").toString());
	}
	if(mapvalue.get("Has Components").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.subcomponents(mapvalue.get("SubItem").toString(), mapvalue.get("SubUnit").toString(), mapvalue.get("SubQuantity").toString());
	}
	Itemmastertestpage.additem_save();
	Itemmastertestpage.asser.assertAll();
}
@Test(priority=3, dataProvider="IOLinfo", dataProviderClass=Logindata.class)
public void IOLitem(HashMap<String, String> mapvalue)
{
	log=report.startTest(mapvalue.get("Item info").toString()+" "+mapvalue.get("Code").toString());
	Itemmastercommon(mapvalue);
	if(mapvalue.get("Has Attributes").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.IOL_attribute_ioltype(mapvalue.get("IOL TYPE").toString());
		Itemmastertestpage.IOL_attribute_iolmetal(mapvalue.get("IOL METAL").toString());
		Itemmastertestpage.IOL_attribute_iolbrand(mapvalue.get("IOL BRAND").toString());
		Itemmastertestpage.IOL_attribute_iolshape(mapvalue.get("IOL SHAPE").toString());
		Itemmastertestpage.IOL_attribute_iolorientation(mapvalue.get("IOL ORIENTATION").toString());
		Itemmastertestpage.IOL_attribute_iolpower(mapvalue.get("IOL POWER").toString());
		Itemmastertestpage.IOL_attribute_ioleye(mapvalue.get("IOL EYE").toString());
		Itemmastertestpage.IOL_attribute_iolcolor(mapvalue.get("IOL COLOR").toString());
		Itemmastertestpage.IOL_attribute_iolname(mapvalue.get("IOL NAME").toString());
	}
	if(mapvalue.get("Has Components").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.subcomponents(mapvalue.get("SubItem").toString(), mapvalue.get("SubUnit").toString(), mapvalue.get("SubQuantity").toString());
	}
	Itemmastertestpage.additem_save();
	Itemmastertestpage.asser.assertAll();
}
@Test(priority=4, dataProvider="Spectacleinfo", dataProviderClass=Logindata.class)
public void Spectacleitem(HashMap<String, String> mapvalue)
{
	log=report.startTest(mapvalue.get("Item info").toString()+" "+mapvalue.get("Code").toString());
	Itemmastercommon(mapvalue);
	if(mapvalue.get("Has Attributes").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.Spectacle_lenstype(mapvalue.get("LENS TYPE").toString());
		Itemmastertestpage.Spectacle_lensmaterial(mapvalue.get("LENS MATERIAL").toString());
		Itemmastertestpage.Spectacle_lensbrand(mapvalue.get("LENS BRAND").toString());
		Itemmastertestpage.Spectacle_lensmanufacture(mapvalue.get("LENS MANUFACTURER").toString());
		Itemmastertestpage.Spectacle_lensshape(mapvalue.get("LENS SHAPE").toString());
		Itemmastertestpage.Spectacle_lenssize(mapvalue.get("LENS SIZE").toString());
		Itemmastertestpage.Spectacle_lensdiameter(mapvalue.get("LENS DIAMETER").toString());
		Itemmastertestpage.Spectacle_lenspower(mapvalue.get("LENS POWER").toString());
		Itemmastertestpage.Spectacle_lenspolarize(mapvalue.get("POLARIZED").toString());
		Itemmastertestpage.Spectacle_lensphotocramatic(mapvalue.get("PHOTOCHROMATIC").toString());
		Itemmastertestpage.Spectacle_lenstint(mapvalue.get("TINT").toString());
	}
	if(mapvalue.get("Has Components").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.subcomponents(mapvalue.get("SubItem").toString(), mapvalue.get("SubUnit").toString(), mapvalue.get("SubQuantity").toString());
	}
	Itemmastertestpage.additem_save();
	Itemmastertestpage.asser.assertAll();
}
@Test(priority=5, dataProvider="fixedinfo", dataProviderClass=Logindata.class)
public void Fixedassetitem(HashMap<String, String> mapvalue)
{
	log=report.startTest(mapvalue.get("Item info").toString()+" "+mapvalue.get("Code").toString());
	Itemmastercommon(mapvalue);
	if(mapvalue.get("Has Attributes").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.fixedassets_type(mapvalue.get("FIXED ASSETS TYPE").toString());
		Itemmastertestpage.fixedassets_brand(mapvalue.get("FIXED ASSETS BRAND").toString());
		Itemmastertestpage.fixedassets_color(mapvalue.get("FIXED ASSETS COLOR").toString());
		Itemmastertestpage.fixedassets_usage(mapvalue.get("FIXED ASSETS USAGE").toString());
	}
	if(mapvalue.get("Has Components").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.subcomponents(mapvalue.get("SubItem").toString(), mapvalue.get("SubUnit").toString(), mapvalue.get("SubQuantity").toString());
	}
	Itemmastertestpage.additem_save();
	Itemmastertestpage.asser.assertAll();
}
@Test(priority=6, dataProvider="contactlensinfo", dataProviderClass=Logindata.class)
public void Contactlensitem(HashMap<String, String> mapvalue)
{
	log=report.startTest(mapvalue.get("Item info").toString()+" "+mapvalue.get("Code").toString());
	Itemmastercommon(mapvalue);
	if(mapvalue.get("Has Attributes").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.Spectacle_lenstype(mapvalue.get("LENS TYPE").toString());
		Itemmastertestpage.Spectacle_lensmaterial(mapvalue.get("LENS MATERIAL").toString());
		Itemmastertestpage.Spectacle_lensbrand(mapvalue.get("LENS BRAND").toString());
		Itemmastertestpage.contactlens_manufacturer(mapvalue.get("LENS MANUFACTURER").toString());
		Itemmastertestpage.contactlens_power(mapvalue.get("LENS POWER").toString());
		Itemmastertestpage.contactlens_color(mapvalue.get("LENS COLOR").toString());
		Itemmastertestpage.contactlens_disposability(mapvalue.get("LENS DISPOSABILITY").toString());
	}
	if(mapvalue.get("Has Components").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.subcomponents(mapvalue.get("SubItem").toString(), mapvalue.get("SubUnit").toString(), mapvalue.get("SubQuantity").toString());
	}
	Itemmastertestpage.additem_save();
	Itemmastertestpage.asser.assertAll();
}
@Test(priority=7, dataProvider="sunglassinfo", dataProviderClass=Logindata.class)
public void Sunglassitem(HashMap<String, String> mapvalue)
{
	log=report.startTest(mapvalue.get("Item info").toString()+" "+mapvalue.get("Code").toString());
	Itemmastercommon(mapvalue);
	if(mapvalue.get("Has Attributes").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.sunglass_type(mapvalue.get("SUN GLASS TYPE").toString());
		Itemmastertestpage.sunglass_lensmaterial(mapvalue.get("SUN GLASS LENS MATERIAL").toString());
		Itemmastertestpage.sunglass_framematerial(mapvalue.get("SUN GLASS FRAME MATERIAL").toString());
		Itemmastertestpage.sunglass_brand(mapvalue.get("SUN GLASS BRAND").toString());
		Itemmastertestpage.sunglass_shape(mapvalue.get("SUN GLASS SHAPE").toString());
		Itemmastertestpage.sunglass_size(mapvalue.get("SUN GLASS SIZE").toString());
		Itemmastertestpage.sunglass_color(mapvalue.get("SUN GLASS COLOR").toString());
		Itemmastertestpage.Spectacle_lenspolarize(mapvalue.get("POLARIZED").toString());
		Itemmastertestpage.Spectacle_lensphotocramatic(mapvalue.get("PHOTOCHROMATIC").toString());
	}
	if(mapvalue.get("Has Components").toString().equalsIgnoreCase("yes"))
	{
		Itemmastertestpage.subcomponents(mapvalue.get("SubItem").toString(), mapvalue.get("SubUnit").toString(), mapvalue.get("SubQuantity").toString());
	}
	Itemmastertestpage.additem_save();
	Itemmastertestpage.asser.assertAll();
}
@Test(priority=8, dataProvider="othersinfo", dataProviderClass=Logindata.class)
public void Othersitem(HashMap<String, String> mapvalue)
{
	log=report.startTest(mapvalue.get("Item info").toString()+" "+mapvalue.get("Code").toString());
	Itemmastercommon(mapvalue);
	if(mapvalue.get("Has Components").toString().equalsIgnoreCase("yes"))
	{
	Itemmastertestpage.subcomponents(mapvalue.get("SubItem").toString(), mapvalue.get("SubUnit").toString(), mapvalue.get("SubQuantity").toString());
	}
	Itemmastertestpage.additem_save();
	Itemmastertestpage.asser.assertAll();
}

//common for all items
public void Itemmastercommon(HashMap<String, String> mapvalue)
{
	startdriver();
	Itemmastertestpage.getusername_getpassword();
	Itemmastertestpage.inventory_itemmaster();
	Itemmastertestpage.inventory_additem();
	Itemmastertestpage.additem_iteminfo(mapvalue.get("Item info").toString());
	Itemmastertestpage.additem_general_code(mapvalue.get("Code").toString());
	Itemmastertestpage.additem_general_name(mapvalue.get("Name").toString());
	Itemmastertestpage.additem_general_HSN(mapvalue.get("HSN").toString());
	Itemmastertestpage.additem_general_printname(mapvalue.get("Print Name").toString());
	Itemmastertestpage.additem_general_chargecategory(mapvalue.get("Charge Category").toString());
	Itemmastertestpage.additem_general_form(mapvalue.get("Form").toString());
	Itemmastertestpage.additem_general_buyunit(mapvalue.get("Buying Unit").toString());
	Itemmastertestpage.additem_general_sellunit(mapvalue.get("Selling Unit").toString());
	Itemmastertestpage.additem_general_converunit(mapvalue.get("Conversion Unit").toString());
	Itemmastertestpage.additem_general_prefersupplier(mapvalue.get("Preferred Supplier").toString(), mapvalue.get("Quantity").toString());
	Itemmastertestpage.additem_general_reorderlevel(mapvalue.get("Reorder Level").toString());
	Itemmastertestpage.additem_general_defaultpurchaseqty(mapvalue.get("Default Purchase Qty").toString());
	Itemmastertestpage.additem_flags_BatchEntryMode(mapvalue.get("Batch Entry Mode").toString());
	Itemmastertestpage.additem_flags_PricingMode(mapvalue.get("Pricing Mode").toString());
	Itemmastertestpage.additem_flags_HasAttributes(mapvalue.get("Has Attributes").toString());
	Itemmastertestpage.additem_flags_ExpiryDate(mapvalue.get("Expiry Date").toString());
	Itemmastertestpage.additem_flags_HasComponents(mapvalue.get("Has Components").toString());
	Itemmastertestpage.additem_flags_ExpiryFormat(mapvalue.get("Expiry Format").toString());
	Itemmastertestpage.additem_flags_POGRProcess(mapvalue.get("PO/GR Process").toString());
	Itemmastertestpage.additem_flags_IsOTC(mapvalue.get("Is OTC").toString());
	Itemmastertestpage.additem_flags_IsNarcotic(mapvalue.get("Is Narcotic").toString());
	Itemmastertestpage.additem_flags_ScheduleHDrug(mapvalue.get("Is Schedule H Drug").toString());
}
@AfterMethod
public void teardown()
{
	report.endTest(log);
	report.flush();
}
}
