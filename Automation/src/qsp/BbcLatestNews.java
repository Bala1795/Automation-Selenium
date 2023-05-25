package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcLatestNews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://www.bbc.com/");
List<WebElement> lbn = driver.findElements(By.xpath("//h2[text()='Latest Business News']/../ul/li/a/h3"));
int count = lbn.size();
System.out.println(count);
for (WebElement bn:lbn)
{
	System.out.println(bn.getText());
}

}
}