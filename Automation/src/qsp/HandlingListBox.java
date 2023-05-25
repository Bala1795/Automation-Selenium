package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		WebElement monthListbox = driver.findElement(By.id("month"));
		Select s=new Select(monthListbox);
		s.selectByIndex((7));
		Thread.sleep(4000);
		s.selectByValue("12");
		Thread.sleep(4000);
		s.selectByVisibleText("Feb");
		
		
		

	}

}
