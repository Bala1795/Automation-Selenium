package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAllignment {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
	int y1=driver.findElement(By.xpath("(//input[@name='sex'])[1]")).getLocation().getY();
	int y2=driver.findElement(By.xpath("(//input[@name='sex'])[2]")).getLocation().getY();
	int y3=driver.findElement(By.xpath("(//input[@name='sex'])[3]")).getLocation().getY();
	if(y1==y2 && y2==y3)
	{
		System.out.println("Radio buttons are properly alligned ");
	}
	else
	{

		System.out.println("Radio buttons are not properly alligned ");
	
	}
driver.close();

	}
	

}
