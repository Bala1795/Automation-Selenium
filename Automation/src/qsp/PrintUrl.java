package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUrl {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String url = driver.findElement(By.linkText("Forgotten password?")).getAttribute("href");
		System.out.println(url);
		driver.close();
		
		

	}

}
