package MTR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Balu/Desktop/Hotel.html");
		WebElement CpListBox = driver.findElement(By.id("cp"));
		Select s= new Select (CpListBox);
		WebElement fsoption = s.getFirstSelectedOption();
		System.out.println(fsoption.getText());
		driver.close();
		
		

	}

}
