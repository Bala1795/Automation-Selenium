package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMuliSelectDeselect {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Balu/Desktop/Hotel.html");
		WebElement mtrlb = driver.findElement(By.id("mtr"));
		Select s=new Select( mtrlb);
		s.selectByIndex(0);
		Thread.sleep(4000);
		s.selectByVisibleText("poori");
		Thread.sleep(4000);
		s.deselectAll();
		System.out.println(s.isMultiple());
	
		

	}

}
