package Mock;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx"); // create an object of properties class
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		
	}

}
