package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAxis {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
 public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement log = driver.findElement(By.name("login"));
		 int x1=log.getLocation().getX();
		 int y1=log.getLocation().getY();
		 System.out.println("xaxis ="+x1);
		 System.out.println("yaxis ="+y1);
		 driver.close();
		 
		 
		 
		
		
		
	}

}
