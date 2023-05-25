package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib
{
	
	public String getProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property"); // create an object of properties class
		Properties p = new Properties(); //load the file so that getProperty method will come to know where the file is
		p.load(fis); // read or get the data from t
		String data = p.getProperty(key);
        return data;
		}
	public String getExcelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx"); // create an object of properties class
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public void setExcelData(String SheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx"); // create an object of properties class
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).getCell(cell).setCellValue("fail");
		FileOutputStream fos= new FileOutputStream("./data/TestScript.xlsx");
		wb.write(fos);
		wb.close();
	}

}
