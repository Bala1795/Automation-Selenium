package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMethodcls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	@Test
	public void validLogin() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPage1 l1= new LoginPage1();
	PageFactory.initElements(driver, l1);
	l1.setLogin1("admin", "manager");
	driver.close();
}
}