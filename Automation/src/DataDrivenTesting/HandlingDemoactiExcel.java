package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDemoactiExcel {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx"); // create an object of properties class
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("LoginActi").getRow(1).getCell(0).getStringCellValue();
		String un = wb.getSheet("LoginActi").getRow(1).getCell(1).getStringCellValue();
		String pw = wb.getSheet("LoginActi").getRow(1).getCell(2).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
}
}