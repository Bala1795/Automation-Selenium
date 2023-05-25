package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsDemoActi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click(); 
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> wh = driver.getWindowHandles();
		for(String a:wh) {
			driver.switchTo().window(a);
List<WebElement> headings = driver.findElements(By.xpath("//h2"));		
for(WebElement b:headings)		
{ 
	String text = b.getText();
	System.out.println(text);
		}
}
	}
}
