package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDob {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		WebElement datelistbox = driver.findElement(By.id("day"));
		WebElement monthListbox = driver.findElement(By.id("month"));
		WebElement yearListbox = driver.findElement(By.id("year"));
		Select s=new Select(datelistbox );
	s.selectByIndex(16);
	Select s1=new Select(monthListbox );
	s1.selectByVisibleText("Feb");
	Select s2=new Select(yearListbox );
	s2.selectByValue("1995");
	driver.close();
	
	
	

	}

}
