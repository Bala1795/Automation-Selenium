package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphoneProductAndPrice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone14promax"+Keys.ENTER);
		List<WebElement> pname = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
		int count = pname.size();
		System.out.println(count);
		for (int i=0;i<count;i++)
		{
               System.out.print(pname.get(i).getText());
               System.out.print("  = = >");
               System.out.println(price.get(i).getText());
		}
		
		
		

}
}