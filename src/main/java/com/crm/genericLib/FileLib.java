package com.crm.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This generic class is used to handle files
 * @author USER
 *
 */

public class FileLib {
	/**
	 * This generic method is used to fetch data from excelsheet
	 * @param excelPath
	 * @param sheet
	 * @param r
	 * @param c
	 * @return cellValue
	 * @throws Throwable
	 */

	public String readExcelData(String excelPath,String sheet,int  r,int c) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String cellValue = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return cellValue;
	}
	/**
	 * This generic method is used for count the number of rows which are filled with data
	 * @param excelPath
	 * @param sheet
	 * @return rowCount
	 * @throws Throwable
	 */
	
	public int getRowCount(String excelPath,String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount=wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	/**
	 * This generic method is used to write data into the excel
	 * @param excelPath
	 * @param sheet
	 * @param r
	 * @param c
	 * @param data
	 * @throws Throwable
	 */
	public void setCellData(String excelPath,String sheet,int r,int c,String data) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}
	/**
	 * This generic method is used to fetch the value for corresponding key from property file
	 * @param propPath
	 * @param key
	 * @return propVlaue
	 * @throws Throwable
	 */
	
	public String getPropKeyValue(String propPath,String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key,"key is incorrect");
		return propValue;
	}
}
