package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
WebElement src = driver.findElement(By.xpath("(//h1[@class='draghandle'])[1]"));
WebElement tar = driver.findElement(By.xpath("(//h1[@class='draghandle'])[4]"));
          Actions a= new Actions(driver);
		a.dragAndDrop(src, tar).perform();
		
}
}
