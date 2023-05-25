package DataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class FileLibActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws IOException {
FileLib f= new FileLib();
String url = f.getProperty("url");
String un = f.getProperty("username");
String pw = f.getProperty("password");
WebDriver driver = new ChromeDriver();
driver.get(url);
driver.findElement(By.id("username")).sendKeys(un);
driver.findElement(By.name("pwd")).sendKeys(pw);
driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

}
