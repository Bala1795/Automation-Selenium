package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/Balu/Desktop/Naukri.html");
	File f= new File("./data/Resume..docx");
	String abPpath=f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(abPpath);
	
	
	

}
}
