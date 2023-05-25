package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Balu/Desktop/Hotel.html");
		//inspect
		WebElement CpListBox = driver.findElement(By.id("cp"));
		Select s= new Select (CpListBox);
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		for(WebElement a:alloptions) {
			System.out.println(a.getText());
		}
		/*for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
		}*/
		driver.close();

		}


	}


