package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx"); // create an object of properties class
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("CreateCustomer").getRow(1).getCell(2).setCellValue("fail");
		FileOutputStream fos= new FileOutputStream("./data/TestScript.xlsx");
		wb.write(fos);
		wb.close();
		
				
	}

}
