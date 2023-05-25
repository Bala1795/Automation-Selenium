package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a= new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		 WebElement log = driver.findElement(By.id("loginspan"));
		a.doubleClick(log).perform();
		String etitle = driver.getTitle();
	
	
		if (etitle.contains("Login"))
		{
			System.out.println("Login page is displayed");
		}
		else {
			System.out.println("Login page is not displayed");
		}
}
}