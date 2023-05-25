package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActitimeProperty {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property"); // create an object of properties class
		Properties p = new Properties(); //load the file so that getProperty method will come to know where the file is
		p.load(fis); // read or get the data from t
		String url = p.getProperty("url");
		String pw = p.getProperty("password");
		String un = p.getProperty("username"); 
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[.='Login ']")).click();

	}


}
