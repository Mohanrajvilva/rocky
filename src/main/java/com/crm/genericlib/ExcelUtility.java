package com.crm.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getexceldata(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fs=new FileInputStream(AutoConstant.excelfilepath);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		String data = row.getCell(cellnum).getStringCellValue();
		return data;
		
	}
	public int getrowcount(String sheetname) throws Throwable
	{
		FileInputStream fs=new FileInputStream(AutoConstant.excelfilepath);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet(sheetname);
		int rowcount = sh.getLastRowNum();
		return rowcount;
	}
	public void getcolumncount(String sheetname,int rownum) throws Throwable
	{
		FileInputStream fs=new FileInputStream(AutoConstant.excelfilepath);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet(sheetname);
		int cellcount = sh.getRow(rownum).getLastCellNum();
	}
	public void setdataexcel(String sheetname,int rownum,String data) throws Throwable
	{
		FileInputStream fs=new FileInputStream(AutoConstant.excelfilepath);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		row.getCell(0).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(AutoConstant.excelfilepath);
		wb.write(fos);
		wb.close();
	}

}
