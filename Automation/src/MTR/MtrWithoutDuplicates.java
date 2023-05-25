package MTR;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrWithoutDuplicates {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Balu/Desktop/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s= new Select (mtrListBox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		LinkedHashSet <String> a= new LinkedHashSet <String>();//use hashset also
		for(int i=0;i<count;i++)
		{
		
			String text=alloptions.get(i).getText();
			a.add(text);
		}
		// this for each loop is to print the options vertically 
		for(String order:a) {
			System.out.println(order);
		}
    }
}
