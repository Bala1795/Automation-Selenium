package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginButton {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean log=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	if(log==true)
	{
		System.out.println("login button is enabled and pass");
	}
	else
	{
		System.out.println("login button is disabled and fail");
	}
	driver.close();
}
}