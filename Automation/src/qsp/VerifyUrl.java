package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
static 
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url=driver.getCurrentUrl();
		if (url.equals("https://www.selenium.dev/"))
		{
			System.out.println("Url is succesfully navigating and pass");
		}
		else {
			System.out.println("Url is not successfully navigating and fail");
		}
		driver.close();

	}

}
