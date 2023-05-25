package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoCrmAutomate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	
public static void main(String[] args) throws InterruptedException {
	
 
	WebDriver driver = new ChromeDriver();
	driver.get("http://192.168.237.128:8080/");
	Thread.sleep(2000);
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456");
driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
driver.findElement(By.xpath("(//a[@class='topLink'])[6]")).click();
driver.close();





}
}