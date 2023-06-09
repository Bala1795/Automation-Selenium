package qsp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaAutoSuggestion {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(2000);
	List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	System.out.println(allSugg.size());
	for( WebElement a:allSugg) {
		System.out.println(a.getText());
	}
	/*for(int i=0;i<allSugg.size();i++)
	{
	 String text = allSugg.get(i).getText();
	 System.out.println(text);
	}*/
	allSugg.get(0).click();
	driver.close();
}
}

