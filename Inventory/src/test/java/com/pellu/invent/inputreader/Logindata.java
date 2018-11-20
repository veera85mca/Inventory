package com.pellu.invent.inputreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Logindata {

public FileInputStream File;
public XSSFWorkbook work;
public XSSFSheet sheet;
public Object[][] data=null;

@DataProvider(name="frameinfo")
public Object[][] frameitemdata() throws IOException
{
	String value=null;
	File=new FileInputStream(new File(System.getProperty("user.dir")+"/Inputdata/Inventory datas.xlsx"));
	work=new XSSFWorkbook(File);
	sheet=work.getSheet("Frame");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(1).getLastCellNum();
	data=new Object[r-1][1];
	for(int i=1;i<r;i++)
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		for(int j=0;j<c;j++)
		{
			Cell ce=sheet.getRow(i+1).getCell(j);
			if(ce.getCellTypeEnum()==CellType.STRING)
			{
				value=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}else if (ce.getCellTypeEnum()==CellType.NUMERIC) {
				DataFormatter form=new DataFormatter();
				value=form.formatCellValue(ce).toString();
			}else if (ce.getCellTypeEnum()==CellType.BLANK) {
				value=null;
			}
		map.put(sheet.getRow(1).getCell(j).toString(), value);	
		}
		data[i-1][0]=map;
	}
	return data;	
}

@DataProvider(name="IOLinfo")
public Object[][] IOLitemdata() throws IOException
{
	String value=null;
	File=new FileInputStream(new File(System.getProperty("user.dir")+"/Inputdata/Inventory datas.xlsx"));
	work=new XSSFWorkbook(File);
	sheet=work.getSheet("IOL");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(1).getLastCellNum();
	data=new Object[r-1][1];
	for(int i=1;i<r;i++)
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		for(int j=0;j<c;j++)
		{
			Cell ce=sheet.getRow(i+1).getCell(j);
			if(ce.getCellTypeEnum()==CellType.STRING)
			{
				value=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}else if (ce.getCellTypeEnum()==CellType.NUMERIC) {
				DataFormatter form=new DataFormatter();
				value=form.formatCellValue(ce).toString();
			}else if (ce.getCellTypeEnum()==CellType.BLANK) {
				value=null;
			}
		map.put(sheet.getRow(1).getCell(j).toString(), value);	
		}
		data[i-1][0]=map;
	}
	return data;	
}
@DataProvider(name="Spectacleinfo")
public Object[][] Spectacleitemdata() throws IOException
{
	String value=null;
	File=new FileInputStream(new File(System.getProperty("user.dir")+"/Inputdata/Inventory datas.xlsx"));
	work=new XSSFWorkbook(File);
	sheet=work.getSheet("Spectacle");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(1).getLastCellNum();
	data=new Object[r-1][1];
	for(int i=1;i<r;i++)
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		for(int j=0;j<c;j++)
		{
			Cell ce=sheet.getRow(i+1).getCell(j);
			if(ce.getCellTypeEnum()==CellType.STRING)
			{
				value=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}else if (ce.getCellTypeEnum()==CellType.NUMERIC) {
				DataFormatter form=new DataFormatter();
				value=form.formatCellValue(ce).toString();
			}else if (ce.getCellTypeEnum()==CellType.BLANK) {
				value=null;
			}
		map.put(sheet.getRow(1).getCell(j).toString(), value);	
		}
		data[i-1][0]=map;
	}
	return data;	
}
@DataProvider(name="fixedinfo")
public Object[][] Fixeditemdata() throws IOException
{
	String value=null;
	File=new FileInputStream(new File(System.getProperty("user.dir")+"/Inputdata/Inventory datas.xlsx"));
	work=new XSSFWorkbook(File);
	sheet=work.getSheet("Fixed asset");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(1).getLastCellNum();
	data=new Object[r-1][1];
	for(int i=1;i<r;i++)
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		for(int j=0;j<c;j++)
		{
			Cell ce=sheet.getRow(i+1).getCell(j);
			if(ce.getCellTypeEnum()==CellType.STRING)
			{
				value=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}else if (ce.getCellTypeEnum()==CellType.NUMERIC) {
				DataFormatter form=new DataFormatter();
				value=form.formatCellValue(ce).toString();
			}else if (ce.getCellTypeEnum()==CellType.BLANK) {
				value=null;
			}
		map.put(sheet.getRow(1).getCell(j).toString(), value);	
		}
		data[i-1][0]=map;
	}
	return data;	
}
@DataProvider(name="contactlensinfo")
public Object[][] contactitemdata() throws IOException
{
	String value=null;
	File=new FileInputStream(new File(System.getProperty("user.dir")+"/Inputdata/Inventory datas.xlsx"));
	work=new XSSFWorkbook(File);
	sheet=work.getSheet("Contact lens");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(1).getLastCellNum();
	data=new Object[r-1][1];
	for(int i=1;i<r;i++)
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		for(int j=0;j<c;j++)
		{
			Cell ce=sheet.getRow(i+1).getCell(j);
			if(ce.getCellTypeEnum()==CellType.STRING)
			{
				value=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}else if (ce.getCellTypeEnum()==CellType.NUMERIC) {
				DataFormatter form=new DataFormatter();
				value=form.formatCellValue(ce).toString();
			}else if (ce.getCellTypeEnum()==CellType.BLANK) {
				value=null;
			}
		map.put(sheet.getRow(1).getCell(j).toString(), value);	
		}
		data[i-1][0]=map;
	}
	return data;	
}
@DataProvider(name="sunglassinfo")
public Object[][] sunglassitemdata() throws IOException
{
	String value=null;
	File=new FileInputStream(new File(System.getProperty("user.dir")+"/Inputdata/Inventory datas.xlsx"));
	work=new XSSFWorkbook(File);
	sheet=work.getSheet("Sun Glass");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(1).getLastCellNum();
	data=new Object[r-1][1];
	for(int i=1;i<r;i++)
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		for(int j=0;j<c;j++)
		{
			Cell ce=sheet.getRow(i+1).getCell(j);
			if(ce.getCellTypeEnum()==CellType.STRING)
			{
				value=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}else if (ce.getCellTypeEnum()==CellType.NUMERIC) {
				DataFormatter form=new DataFormatter();
				value=form.formatCellValue(ce).toString();
			}else if (ce.getCellTypeEnum()==CellType.BLANK) {
				value=null;
			}
		map.put(sheet.getRow(1).getCell(j).toString(), value);	
		}
		data[i-1][0]=map;
	}
	return data;	
}
@DataProvider(name="othersinfo")
public Object[][] othersitemdata() throws IOException
{
	String value=null;
	File=new FileInputStream(new File(System.getProperty("user.dir")+"/Inputdata/Inventory datas.xlsx"));
	work=new XSSFWorkbook(File);
	sheet=work.getSheet("Others");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(1).getLastCellNum();
	data=new Object[r-1][1];
	for(int i=1;i<r;i++)
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		for(int j=0;j<c;j++)
		{
			Cell ce=sheet.getRow(i+1).getCell(j);
			if(ce.getCellTypeEnum()==CellType.STRING)
			{
				value=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}else if (ce.getCellTypeEnum()==CellType.NUMERIC) {
				DataFormatter form=new DataFormatter();
				value=form.formatCellValue(ce).toString();
			}else if (ce.getCellTypeEnum()==CellType.BLANK) {
				value=null;
			}
		map.put(sheet.getRow(1).getCell(j).toString(), value);	
		}
		data[i-1][0]=map;
	}
	return data;
}


}
