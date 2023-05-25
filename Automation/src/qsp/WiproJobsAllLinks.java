package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobsAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
int count = alllinks.size();
System.out.println(count);
for(WebElement links:alllinks)
{
	System.out.println(links.getAttribute("href"));
	
}
}
}
