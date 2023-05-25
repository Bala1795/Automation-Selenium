package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllLinks {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
System.out.println(alllinks.size());
/*for (WebElement a:alllinks)
{
	System.out.println(a.getText());
	
}*/
for(int i=0;i<alllinks.size();i++)
{
	String text = alllinks.get(i).getAttribute("href");
	System.out.println(text);
	}

driver.close();


	

	}
}

